package com.luban;


import com.luban.importaware.EnableLuban;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.luban")
@EnableAspectJAutoProxy  //使用cglib动态代理
@EnableLuban
@ImportResource("classpath:application_aop.xml")

public class AppConfig {
}
