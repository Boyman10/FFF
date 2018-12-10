package com.oc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestTest {

    @Test
    public void sayHelloTest() {

        FTest test = new FTest();
        assertTrue(test.sayHello().equals("Hello"));

    }

}
