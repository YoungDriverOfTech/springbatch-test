package com.itemReaderFile;


import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("fileFileWriter")
public class fileFileWriter implements ItemWriter<Teacher> {
    @Override
    public void write(List<? extends Teacher> items) throws Exception{
        for(Teacher teacher:items){
            System.out.println(teacher);
        }
    }
}
