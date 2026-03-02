package com.tc.springmicroservice.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {
        "com.tc.springmicroservice.customer",
        "com.tc.springmicroservice.amqp",
})
@EnableFeignClients(basePackages = "com.tc.springmicroservice.clients")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }
}
