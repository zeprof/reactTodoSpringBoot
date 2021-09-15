package com.lacouf.reacttodo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class ReactTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactTodoApplication.class, args);
    }

}
