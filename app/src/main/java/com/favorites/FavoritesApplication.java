package com.favorites;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FavoritesApplication  {

    public static void main(String[] args) {
        SpringApplication.run(FavoritesApplication.class, args);
    }

    @ResponseBody
    @GetMapping("test")
    public String test() {
	    return "hello world";
    }

}