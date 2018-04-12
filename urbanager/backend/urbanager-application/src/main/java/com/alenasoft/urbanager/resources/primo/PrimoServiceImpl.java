package com.alenasoft.urbanager.resources.primo;

import java.util.ArrayList;
import java.util.List;

public class PrimoServiceImpl implements PrimoService{

    @Override
    public String isPrimo(int value) throws Exception {
        String result = "FAIL";
        if (value < 2) {
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

    @Override
    public List<String> getFirstNPrimo(int value) {
        List result = new ArrayList<String>();
        int i = 0;
        int j = 0;
        while (i<value) {
            try {
                if (isPrimo(j)=="OK"){
                    result.add(String.valueOf(j));
                    i++;
                }
            } catch (Exception e) {

            }
            j++;
        }
        return result;
    }


}


