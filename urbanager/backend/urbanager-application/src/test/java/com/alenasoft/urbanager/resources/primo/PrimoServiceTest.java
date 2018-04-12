package com.alenasoft.urbanager.resources.primo;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimoServiceTest {

    @Test
    public void testIsPrimoIfPrimoIntegerShouldReturnOK() throws Exception {
        PrimoService primoService = new PrimoServiceImpl();
        int value = 5;
        String expected = "OK";
        assertEquals(expected,primoService.isPrimo(value));
    }

    @Test
    public void testIsPrimoIfNoPrimoIntegerShouldReturnFAIL() throws Exception {
        PrimoService primoService = new PrimoServiceImpl();
        int value = 4;
        String expected = "FAIL";
        assertEquals(expected,primoService.isPrimo(value));
    }

    @Test(expected = Exception.class)
    public void testIsPrimoIfValueIsLessThanOneShouldReturnException() throws Exception{
        PrimoService primoService = new PrimoServiceImpl();
        int value = -3;
        primoService.isPrimo(value);
    }

    @Test
    public void testGetFirtsNPrimoIfValueIsTenShouldReturnAListOfFirstTenPrime() throws Exception{
        PrimoService primoService = new PrimoServiceImpl();
        int value = 10;
        List<String> expected = Arrays.asList("2","3","5","7","11","13","17","19","23","29");
        Assert.assertEquals(expected,primoService.getFirstNPrimo(value));
    }

}