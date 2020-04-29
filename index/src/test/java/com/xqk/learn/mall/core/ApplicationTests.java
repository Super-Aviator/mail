package com.xqk.learn.mall.core;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
//@SpringBootTest
//@ActiveProfiles("dev")
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void findByUsernameTest() {
        BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
        log.info(encode.encode("123321xqk"));
    }
}
