package com.alenasoft.urbanager.resources.primo;

public class PrimoService {

    public String isPrimo(int value){
    String result = "";
    int j =0;
        for (int i = 2; i<value ; i++){
            if(value % i ==0){
                j++;
            }
        }
        if (j==0){
            result = "OK";
        }else{
            result = "FAIL";
        }
        return result;
    }
}
