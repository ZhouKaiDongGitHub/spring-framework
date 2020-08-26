package com.luban.importaware;

import org.springframework.context.annotation.ImportAware;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;


public class DBConfig2 implements ImportSelector {


    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[0];
    }
}
