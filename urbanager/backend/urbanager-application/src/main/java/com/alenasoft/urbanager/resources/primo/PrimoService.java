package com.alenasoft.urbanager.resources.primo;

public class PrimoService {

    public String isPrimo(int value) throws Exception {
    String result = "FAIL";
    if (value < 1) {
        throw new Exception();
    }
    int j =0;
        for (int i = 2; i<value ; i++){
            if(value % i ==0){
                j++;
            }
        }
        if (j==0){
            result = "OK";
        }
        return result;
    }
}
