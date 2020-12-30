package com.adt.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class SpringbootStaticTestApplicationTests {

    @Test
    void contextLoads() {
        BigDecimal a=new BigDecimal(12345678119.00);
        System.out.println(a+"元");
    }

}
