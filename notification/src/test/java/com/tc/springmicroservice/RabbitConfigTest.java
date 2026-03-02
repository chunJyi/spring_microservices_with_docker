package com.tc.springmicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RabbitConfigTest {

    @Autowired(required = false)
    private Exchange internalTopicExchange;

    @Test
    void contextLoads_and_exchangeBeanExists() {
        assertThat(internalTopicExchange).isNotNull();
    }
}

