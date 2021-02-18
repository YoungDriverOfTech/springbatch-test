package com.itemReaderDB;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;


import java.util.List;


@Component("dbJdbcWriter")
public class DbJdbcWriter implements ItemWriter<Teacher> {


    @Override
    public void write(List<? extends Teacher> items) throws Exception {
        for (Teacher teacher:items){
            System.out.println(teacher);
        }
    }
}
