package com.alenasoft.urbanager.resources.primo;

import java.util.ArrayList;
import java.util.List;

public class PrimoServiceImpl implements PrimoService{

    @Override
    public String isPrimoToString(int value) throws Exception {
        String result = "FAIL";
        if (value < 2) {
            throw new Exception();
        }
        if (isPrimo(value)){
            result = "OK";
        }
        return result;
    }

    @Override
    public List<String> getFirstNPrimo(int value) throws Exception {
        if (value<1) {
            throw new Exception();
        }
        List result = new ArrayList<String>();
        int i = 0;
        int j = 2;
        while (i<value) {
            try {
                if (isPrimo(j)){
                    result.add(String.valueOf(j));
                    i++;
                }
            } catch (Exception e) {}
            j++;
        }
        return result;
    }

    private boolean isPrimo(int value) {
        for (int i = 2; i<value ; i++){
            if(value % i ==0){
                return false;
            }
        }
        return true;
    }


}


