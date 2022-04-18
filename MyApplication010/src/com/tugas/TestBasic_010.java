package com.tugas;

import java.util.Scanner;

public class TestBasic_010 {
    public static void main(String[] args) {

        kalkulator();
    }
    
    public static void kalkulator() {
        
        Scanner scan = new Scanner(System.in);        
        Double ap1, ap2;
        char op;
        
        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("________________________");
        System.out.println("Kalkulator Sederhana-010");
        System.out.println("");
            
        System.out.print("Masukkan angka pertama: ");
            ap1 = scan.nextDouble();
            
        System.out.print("Operasi: +,-,*,/: ");
            op = scan.next().charAt(0);
            
        System.out.print("Masukkan angka kedua: ");
            ap2 = scan.nextDouble();

        
     
        switch(op)
        {
            case '+':             {
                double penjumlahan  = ap1+ap2;
                System.out.print("Hasil dari operasi [ " + op+ " ] Antara angka [ "+ap1+" ] Dan [ "+ap2+ " ] Adalah "+penjumlahan);break;
            }
            case '-':             {
                double pengurangan  = ap1-ap2;
                System.out.print("Hasil dari operasi [ " + op+ " ] Antara angka [ "+ap1+" ] Dan [ "+ap2+ " ] Adalah "+pengurangan);break;
            }
            case '*':             {
                double perkalian  = ap1*ap2;
                System.out.print("Hasil dari operasi [ " + op+ " ] Antara angka [ "+ap1+" ] Dan [ "+ap2+ " ] Adalah "+perkalian);break;
            }
            case '/':             {
                double pembagian = ap1/ap2;
                System.out.print("Hasil dari operasi [ " + op+ " ] Antara angka [ "+ap1+" ] Dan [ "+ap2+ " ] Adalah "+pembagian);break;
            }
            default : {
                System.out.print(" ");
                return;
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.print("Apakah Ingin Ulang ? Y/T: ");
            i = scan.next();   
            
        }   
    }
}
