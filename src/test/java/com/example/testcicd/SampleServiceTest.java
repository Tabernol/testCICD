package com.example.testcicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SampleServiceTest {

    private final SampleService sampleService = new SampleService();

    @Test
    public void sampleAddTest() {
        int result = sampleService.sampleTestAdd(1, 5);
        assertEquals(6, result);
    }

}