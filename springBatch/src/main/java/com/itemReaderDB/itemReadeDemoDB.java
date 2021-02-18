package com.itemReaderDB;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.support.MySqlPagingQueryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class itemReadeDemoDB {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private DataSource dataSource;

    @Autowired
    @Qualifier("dbJdbcWriter")
    private ItemWriter<? super Teacher> dbJdbcWriter;

    @Bean
    public Job itemReaderDbJob(){
        return jobBuilderFactory.get("itemReaderDbJob")
                .start(itemReadeDemoDBStep())
                .build();
    }

    @Bean
    public Step itemReadeDemoDBStep() {
        return stepBuilderFactory.get("itemReadeDemoDBStep")
                .<Teacher,Teacher>chunk(2)
                .reader(dbJdbcReader())
                .writer(dbJdbcWriter)
                .build();
    }

    @Bean
    @StepScope
    public JdbcPagingItemReader<Teacher> dbJdbcReader() {
        JdbcPagingItemReader<Teacher> reader = new JdbcPagingItemReader<Teacher>();

        // 指明数据源对象
        reader.setDataSource(dataSource);
        // 一次取多少条数据
        reader.setFetchSize(2);
        //把读取到的记录转换成Teacher对象
        //实现映射
        reader.setRowMapper(new RowMapper<Teacher>() {
            @Override
            public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
                Teacher teacher = new Teacher();
                // 指定字段
                teacher.settNo(rs.getInt(1));
                teacher.settName(rs.getString(2));
                teacher.settSex(rs.getString(3));
                teacher.settBirthday(rs.getDate(4));
                teacher.setProf(rs.getString(5));
                teacher.setDepart(rs.getString(6));
                return teacher;
            }
        });
        //指定sql语句
        MySqlPagingQueryProvider provider = new MySqlPagingQueryProvider();
        provider.setSelectClause("tNo,tName,tSex,tBirthday,prof,depart");
        provider.setFromClause("from teachers");

        //指定根据哪个字段进行排序
        Map<String, Order> sort = new HashMap<>(1);
        sort.put("tNO", Order.ASCENDING);
        provider.setSortKeys(sort);
        reader.setQueryProvider(provider);
        return reader;
    }

}
