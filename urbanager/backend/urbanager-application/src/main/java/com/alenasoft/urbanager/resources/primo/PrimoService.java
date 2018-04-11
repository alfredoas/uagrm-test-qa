package com.alenasoft.urbanager.resources.primo;


public class PrimoService {

    public String isPrimo(int value) {
        for (int i = 2 ; i<value ;i++){
            if (value % i == 0){
                return "FAIL";
            }
        }
        return "OK";
    }


}
