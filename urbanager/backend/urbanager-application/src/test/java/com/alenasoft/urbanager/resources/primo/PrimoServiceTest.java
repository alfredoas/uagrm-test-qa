package com.alenasoft.urbanager.resources.primo;

import com.alenasoft.urbanager.resources.hello.PrimoService;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimoServiceTest {

    @Test
    public void testIsPrimoIfIntegerIsPrimoShouldReturnOK() {
        PrimoService primoService = new PrimoService();
        assertEquals("OK", primoService.isPrimo());
    }

}