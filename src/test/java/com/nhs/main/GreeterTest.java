package com.nhs.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    public void greetTest() {
        Greeter greeter = new Greeter();
        String testMethod = greeter.greet("nhs Task");
        assertEquals("Hello Nhs Task", testMethod);

    }

    @Test
    public void greetTestWithBlank() {
        Greeter greeter = new Greeter();
        String testMethod = greeter.greet(" ");
        assertEquals(null, testMethod);
    }

    @Test
    public void capitalizedFirstLetterTest() {
        Greeter greeter = new Greeter();
        String testMethod = greeter.capitalizedFirstLetter("nhs Task");
        assertEquals("Nhs Task", testMethod);
    }

}
