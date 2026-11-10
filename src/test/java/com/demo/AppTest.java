package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        assertEquals(
            "Hello from AWS EC2 Self Hosted Runner!",
            App.greet()
        );
    }
}
