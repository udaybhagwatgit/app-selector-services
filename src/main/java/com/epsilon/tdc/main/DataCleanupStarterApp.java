package com.epsilon.tdc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.epsilon.tdc.mongorepositories")
@ComponentScan("com.epsilon.tdc")
@SpringBootApplication
public class DataCleanupStarterApp {

    public static void main(String[] args) {
        SpringApplication.run(DataCleanupStarterApp.class, args);
    }
}
