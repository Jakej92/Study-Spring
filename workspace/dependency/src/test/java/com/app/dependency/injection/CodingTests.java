package com.app.dependency.injection;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class CodingTests {
    @Autowired
    private Coding coding;
//    @Autowired
//    private Computer computer;

    @Test
    public void TestCoding() {
        log.info("coding: {}",coding);
    }

    @Test
    public void TestComputer(){
        log.info("computer: {}",coding.getComputer());
    }


}
