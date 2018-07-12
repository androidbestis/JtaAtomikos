package com.xudong;

import com.xudong.config.Test2DBConfig;
import com.xudong.config.TestDBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value={TestDBConfig.class, Test2DBConfig.class})
public class JtaAtomikos {

    public static void main(String[] args){
        SpringApplication.run(JtaAtomikos.class,args);
    }
}
