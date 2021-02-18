package com.itemreader;



import org.springframework.batch.item.ItemReader;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class MyReader implements ItemReader<String> {

    private final Iterator<String> iterator;

    public MyReader(List<String> list){
        this.iterator=list.iterator();
    }

    @Override
    public String read() throws Exception {
        if(iterator.hasNext()){
            return this.iterator.next();
        }else {
            return null;
        }
    }

}
