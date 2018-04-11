package com.alenasoft.urbanager.resources.primo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimoServiceTest {

    @Test
    public void testIsPrimoIfPrimoIntegerShouldReturnOK() {
        PrimoService primoService = new PrimoService();
        int value = 5;
        String expected = "OK";
        assertEquals(expected,primoService.isPrimo(value));
    }

    @Test
    public void testIsPrimoIfNoPrimoIntegerShouldReturnFAIL() {
        PrimoService primoService = new PrimoService();
        int value = 4;
        String expected = "FAIL";
        assertEquals(expected,primoService.isPrimo(value));
    }

    @Test(expected = Exception.class)
    public void testIsPrimoIfValueIsLessThanOneShouldReturnException() {
        PrimoService primoService = new PrimoService();
        int value = -3;
        primoService.isPrimo(value);
    }

}