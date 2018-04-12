package com.alenasoft.urbanager.resources.primo;


import java.util.List;

public interface PrimoService {

    public String isPrimoToString(int value) throws Exception;

    List<String> getFirstNPrimo(int value);
}
