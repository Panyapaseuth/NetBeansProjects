package com.company;

public class Utils {
    public String capitalizeFirstCharOfString(String s){
        return s.substring(0,1).toUpperCase()+
                s.substring(1).toLowerCase();
    }
}
