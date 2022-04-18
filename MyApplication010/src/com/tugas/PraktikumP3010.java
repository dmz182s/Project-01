package com.tugas;

import java.util.Arrays;
import java.util.ArrayList;

public class PraktikumP3010 {
    public static void main(String[] args) {
        // myArray1();
       // myArray2();
       getArrList();
    }
    public static void myArray1() {
        
        int arr1[] = { 3, 10, 5, 8, 11, 2};
        
        Arrays.sort(arr1);
        
        System.out.println("Sorted array: [lengh: "+arr1.length+" ]");
        
        for (int i = 0; i < arr1.length; i++) {
            if(i != 0) {
                System.out.println(", ");
            }
            
            System.out.println(arr1[i]);
        }
        System.out.println("");
    }
    
    public static void myArray2() {
        
        String arr1[] = { "joko", "jaka", "Anton", "Denny", "Aryanti" };
        
        Arrays.sort(arr1);
        
        System.out.println("Sorted array: [length: "+arr1.length+" ]");
        
        for (int i = 0; i < arr1.length; i++) {
            if(i != 0) {
                
                System.out.println(", ");
            }
            System.out.println(arr1[i]);
        }
        System.out.println("");
    }
    
    public static void getArrList() {
        
        ArrayList<String> objlist = new ArrayList<String>();
        
        objlist.add("Radix");
        objlist.add("Suhendra");
        objlist.add("Sasmito");
        objlist.add("Rida");
        objlist.add("Teofilus");
        
        System.out.println("Daftar Dosen MI Polman Astra 1: "+objlist);
        
        objlist.add(1, "Putri");
        objlist.add(4, "Anggun");
        
        System.out.println("Daftar Dosen MI Polman Astra 2: "+objlist);
        
        objlist.remove(1);
        
        System.out.println("Daftar Dosen MI Polman Astra 3: "+objlist);
    }
}
