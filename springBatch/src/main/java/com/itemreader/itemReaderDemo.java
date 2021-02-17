package com.itemreader;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.batch.api.chunk.ItemReader;
import java.util.Arrays;
import java.util.List;

@Configuration
public class itemReaderDemo {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job itemReaderDemoJob(){
        return jobBuilderFactory.get("itemReaderDemoJob")
                .start(itemReaderDemoStep()).build();
    }
    @Bean
    public Step itemReaderDemoStep() {
        return stepBuilderFactory.get("itemReaderDemoStep")
                .<String,String>chunk(2)
                .reader(itemReaderDemoRead())
                .writer(list->{
                    for (String item:list){
                        System.out.println(item+"is my pet");
                    }
                }).build();
    }
    @Bean
    public MyReader itemReaderDemoRead(){
        List<String> data= Arrays.asList("cat","dog","pig","duck");
        return new MyReader(data);
    }
}
