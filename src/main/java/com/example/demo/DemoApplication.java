package com.example.demo;

//import com.example.demo.config.TestSnt;
import com.example.demo.service.SntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean(initMethod = "init")
//    @Autowired
//    public TestSnt testSnt(SntService service){
//        return new TestSnt(service);
//    }

}
