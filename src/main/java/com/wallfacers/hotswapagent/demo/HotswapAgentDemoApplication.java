package com.wallfacers.hotswapagent.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wallfacers.hotswapagent.demo.dao")
public class HotswapAgentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotswapAgentDemoApplication.class, args);
    }

}
