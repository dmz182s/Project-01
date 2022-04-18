package com.tugas;

import java.util.Scanner;

public class MyClass010 {
    public static void main(String[] args) {
        //fungsi1();
        fungsi2();
    }

    public static void fungsi1(){
                
        double price1 = 5.0;
        double price2 = 4.25;
        double subtotal, tax, result;
                
        subtotal = price1 + price2;
        tax = subtotal * 0.1;
        result = subtotal + tax;
        
        System.out.println("Berikut merupakan harga total: ");
        System.out.println("Harga item 1: "+price1);
        System.out.println("Harga item 2: "+price2);
        System.out.println("Sub Total: "+subtotal);
        System.out.println("Tax: "+tax);
        
        System.out.println("Harga total yang harus dibayarkan adalah: "+result);
          
    }
    
    public static void fungsi2() {
        
        double price1,price2 = 0;
        double subtotal, tax, result;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Harga Item 1: ");
        price1 = Double.parseDouble(scan.nextLine());
        
        System.out.println("Harga Item 2: ");
        price2 = Double.parseDouble(scan.nextLine());
        
        subtotal = price1 + price2;
        tax = subtotal * 0.1;
        result = subtotal + tax;
        
        System.out.println("Berikut merupakan harga total: ");
        System.out.println("Harga item 1: "+price1);
        System.out.println("Harga item 2: "+price2);
        System.out.println("Sub Total: "+subtotal);
        System.out.println("Tax: "+tax);
        
        System.out.println("Harga total yang harus dibayarkan adalah: "+result);
        
        scan.close();
    }
}
