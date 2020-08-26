package com.luban.importaware;

import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class DBConfig implements ImportAware {

    private String session;
    private int value;

    public void setImportMetadata(AnnotationMetadata annotationMetadata) {
       Map<String,Object> map =  annotationMetadata.getAnnotationAttributes(EnableLuban.class.getName());
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(map);
        this.session = annotationAttributes.getString("session");
        this.value =  annotationAttributes.getNumber("value");
    }
}
