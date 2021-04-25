package com.example.consumer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author by Zts
 * @Date 2021/4/25 20:38
 * @Classname BeanConfiguration
 * @Description
 **/
@Configuration
public class BeanConfiguration {
    @Bean
    @LoadBalanced//能让RestTemplate在请求时拥有客户端负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}