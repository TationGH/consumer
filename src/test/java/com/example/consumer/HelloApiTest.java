package com.example.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ConsumerApplication.class})
public class HelloApiTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void helloTest() {
        //eureka-provider 为服务提供者注册到eureka的应用名
        //如：当eureka-provider下有localhost:1111和localhost:2222两个节点时，ribbon会自动去做负载均衡
        String s = restTemplate.getForObject("http://eureka-provider/api/hello/getMessage", String.class);
        System.out.println(s);
    }
}
