package com.alenasoft.urbanager.resources.primo;

public class PrimoService {

    public String isPrimo(int value){
    String result = "";
    int j =0;
        for (int i = 1; i<=value ; i++){
            if(value % i ==0){
                j++;
            }
        }
        if (j==2){
            result = "OK";
        }
        return result;
    }
}
