package com.arrays;

import java.util.Comparator;

public class compartordemo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
       String s1=(String) o1;
       String s2= o2.toString();
       if (  s1.length() > s2.length()){
           return -1;   //you want  ascending  na return +1 //if you want decending na return -1
       }
       else if (  s1.length() < s2.length()){
            return +1;  //you want ascending na return -1 //if you want decending na return +1
        }
       else
           return 0;
    }
}
