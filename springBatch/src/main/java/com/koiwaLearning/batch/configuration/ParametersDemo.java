package com.koiwaLearning.batch.configuration;

import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@EnableBatchProcessing
public class ParametersDemo implements StepExecutionListener {

    // 注入创建任务对象的对象
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    // 任务执行由step决定,注入创建step对象的对象
    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    private Map<String, JobParameter> parameters;
    // 创建任务对象
    @Bean
    public Job parametersJob() {

        return jobBuilderFactory.get("parametersJob").start(parameterStep()).build();
    }

    //Job执行的是step,Job使用的数据肯定是在step中使用的
    //所以我们只需要给step传递数据
    //使用step级别的监听来传递数据
    @Bean
    public Step parameterStep() {
        return stepBuilderFactory.get("parameterStep").listener(this)
                .tasklet(new Tasklet() {
                @Override
                public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
                    System.out.println(parameters.get("info"));

                    // 必须要有返回值，这个返回值就会决定job往下执行与否
                    return RepeatStatus.FINISHED;
                }
            }).build();
    }

    @Override
    public void beforeStep(StepExecution stepExecution){
        parameters=stepExecution.getJobParameters().getParameters();
    }
    @Override
    public ExitStatus afterStep(StepExecution arg0){
        return null;
    }

}
