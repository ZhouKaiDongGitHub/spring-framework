package com.luban;


import com.luban.importaware.EnableLuban;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.luban")
@EnableAspectJAutoProxy
@EnableLuban
public class AppConfig {
}
