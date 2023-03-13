package com.arrays;
import java.util.*;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        //we can't sort boolean but all other   primitive data  we can sort
        int [] ar={1,2,34,565,4,9};

        for (int a:ar) {

            System.out.println(a);
            Arrays.sort(ar);
        }
        System.out.println("after sorting");

        for (int a:ar){
            System.out.println(a);
        }



        //non primitive data sorting

        String []names= new String[]{"murugan", "balumuragan", "udhaya", "arunkumar",};
        System.out.println("before sort :\n ");
        for (String s : names) {
            System.out.println(s);
            Arrays.sort(names);
        }
        System.out.println("\nAfter sorting : \n");
        for (String s: names) {
            System.out.println(s);
        }

  // dynamic binding
  Comparator com=new compartordemo();
        Arrays.sort(names,com);
        System.out.println("\n++++++After comparator method++++++\n");
        for (String ss:names) {
            System.out.println(ss);
        }
        }


    }

