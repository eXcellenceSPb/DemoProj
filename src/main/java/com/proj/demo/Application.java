package com.proj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean(initMethod = "init")
//    @Autowired
//    public TestSnt testSnt(SntService service){
//        return new TestSnt(service);
//    }

}
