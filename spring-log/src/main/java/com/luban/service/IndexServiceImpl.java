package com.luban.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class IndexServiceImpl {
    private Log log = LogFactory.getLog(this.getClass().getName());


    public void query(){
       log.info("indexServiceImpl");
    }
}
