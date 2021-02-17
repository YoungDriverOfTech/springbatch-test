package com.itemReaderFile;

import com.itemReaderDB.Teacher;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.validation.BindException;

@Configuration
public class FileItemReader {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    @Qualifier("fileFileWriter")
    private ItemWriter<? super Teacher> fileFileWriter;

    @Bean
    public Job fileItemReaderDemoJob(){
        return jobBuilderFactory.get("fileItemReaderDemoJob")
                .start(fileItemReaderDemoDBStep())
                .build();
    }

    @Bean
    public Step fileItemReaderDemoDBStep() {

        return stepBuilderFactory.get("fileItemReaderDemoDemoStep")
                .<com.itemReaderFile.Teacher, Teacher>chunk(2)
                .reader(fileFileReader())
                .writer(fileFileWriter)
                .build();
    }

    @Bean
    @StepScope
    public FlatFileItemReader<com.itemReaderFile.Teacher> fileFileReader(){
        FlatFileItemReader<com.itemReaderFile.Teacher> reader = new FlatFileItemReader<com.itemReaderFile.Teacher>();
        reader.setResource(new ClassPathResource("teacher.txt"));

        // 数据解析
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setNames("tNo","TName","tSex","tBirthday","prof","depart");
        //把解析出的一行映射为Teacher对象
        DefaultLineMapper<com.itemReaderFile.Teacher> mapper = new DefaultLineMapper<>();
        mapper.setLineTokenizer(tokenizer);
        mapper.setFieldSetMapper(new FieldSetMapper<com.itemReaderFile.Teacher>() {
            @Override
            public com.itemReaderFile.Teacher mapFieldSet(FieldSet fieldSet) throws BindException {
                com.itemReaderFile.Teacher teacher = new com.itemReaderFile.Teacher();
                teacher.settNo(fieldSet.readInt("tNo"));
                teacher.settName(fieldSet.readString("tName"));
                teacher.settSex(fieldSet.readString("tSex"));
                teacher.settBirthday(fieldSet.readDate("tBirthday"));
                teacher.setProf(fieldSet.readString("prof"));
                teacher.setDepart(fieldSet.readString("depart"));
                return teacher;
            }
        });
        // 检查
        mapper.afterPropertiesSet();
        reader.setLineMapper(mapper);
        return reader;
    }
}
