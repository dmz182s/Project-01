package com.tugas;

import java.util.Scanner;

public class PraktikumP4010 {
    public static void main(String[] args) {
        // getNumberArray();
        twoDimensionArray();
    }
    
    public static void getNumberArray() {
        
        Scanner input = new Scanner(System.in);
        
        int numbers[] = new int[5];
        int count = 0;
        int entered = 0;
        
        while (entered < numbers.length) {
            
            System.out.println("Enter Number : ");
            int number = input.nextInt();
            if (10 <= number && number <= 100)
            {
                boolean containsNumber = false;
                entered++;
                for (int i = 0; i < count; i++)
                    if (number == numbers[i])
                        containsNumber = true;
                if (!containsNumber)
                {
                    numbers[count] = number;
                    count++;
                    
                }
                else
                    System.out.println(number + "has already been entered");
            }
            else
                System.out.println("number must be between 10 and 100");
            System.out.println("List number of array");
            for (int i = 0; i < count; i++)
                System.out.println(numbers[i]);

            input.close();
        }
    }
    
    public static void twoDimensionArray() {
        
        int[][] values = new int [4][4];
        
        values[0][0] = 1;
        values[1][1] = 2;
        values[3][2] = 3;
        for (int[] sub : values) {
            for (int x = 0; x < sub.length; x++) {
                System.out.print(sub[x] + " ");
            }
            System.out.println();
        }
    
    }
    
   
}
