package com.grad.othertests;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Test
    public void testOne() {
        assertTrue(false);
    }

    @Test
    public void testTwo() {
        assertTrue(true);
    }

}
