package com.alenasoft.urbanager.resources.primo;

import com.alenasoft.urbanager.resources.primo.PrimoService;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimoServiceTest {

    @Test
    public void testIsPrimoIfIntegerIsPrimoShouldReturnOK() {
        PrimoService primoService = new PrimoService();
        int value = 5;
        String expected = "OK";
        assertEquals(expected, primoService.isPrimo(value));
    }

}