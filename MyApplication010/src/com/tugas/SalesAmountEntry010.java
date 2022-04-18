package com.tugas;

import java.util.Scanner;

public class SalesAmountEntry010 {

    public static void main(String[] args) {
        
        SalesAmount();
    }
    
    public static void SalesAmount(){

        Scanner sc = new Scanner(System.in);
        double[][] sales = new double[6][5];
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 5; j++)
                sales[i][j] = 0.0;
        System.out.println("");
        System.out.println("Enter sales person number (type '-1' to end and see the result");
        int s = sc.nextInt();
        System.out.println("Enter product number: ");
        int p = sc.nextInt();
        System.out.println("Enter sales amount: ");
        int v = sc.nextInt();
        while(s != -1)
        {
            sales[p - 1][s - 1] += v;   //-1 because indexing starts at 0
            System.out.println("");
            System.out.println("Enter sales person number (type '-1' to end and see the result");
            s = sc.nextInt();
            System.out.println("Enter product number: ");
            p = sc.nextInt();
            System.out.println("Enter sales amount: ");
            v = sc.nextInt();
        }
        //Calculating totals and storing in last row and last column:
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 4; j++)
                sales[i][4] += sales[i][j]; //row-wise totals
        for(int j = 0; j < 4; j++)
            for(int i = 0; i < 5; i++)
                sales[5][j] += sales[i][j]; //column-wise totals
        for(int i = 0; i < 5; i++)
            sales[5][4] += sales[i][4];     //grand total
        //Displaying in tabular format:
        System.out.println("");
        System.out.printf("      %10d%10d%10d%10d%10s\n", 1, 2, 3, 4, "Total");
        int i, j;
        for(i = 0; i < 5; i++)
        {
            System.out.printf("%5d", i + 1);
            for(j = 0; j < 5; j++)
                System.out.printf("%10.2f", sales[i][j]);
            System.out.println();
        }
        System.out.printf("%s", "Total");
        for(j = 0; j < 5; j++)
            System.out.printf("%10.2f", sales[5][j]);
        System.out.println();
    
    }
}
