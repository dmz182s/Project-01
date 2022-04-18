package com.tugas;


public class PraktikumP2010 {
    public static void main(String[] args) {
        //myFlow1();
        myFlow2();
    }

    public static void myFlow1() {
        
        int day = 27, month = 2, year = 2011;
        System.out.println("Date: "+day+"-"+month+"-"+year);
        
        int dayinmonth;
        switch (month) {
            case 1 : dayinmonth = 31; break;
            case 2 : dayinmonth = 28; break;
            case 3 : dayinmonth = 31; break;
            case 4 : dayinmonth = 30; break;
            case 5 : dayinmonth = 31; break;
            case 6 : dayinmonth = 30; break;
            case 7 : dayinmonth = 31; break;
            case 8 : dayinmonth = 31; break;
            case 9 : dayinmonth = 30; break;
            case 10 : dayinmonth = 31; break;
            case 11 : dayinmonth = 30; break;
            case 12 : dayinmonth = 31; break;
            default : dayinmonth = 0; break;  
            
        }
        
        System.out.println(dayinmonth+" number of day");
        
        /* for(int x = day; x <= dayinmonth;x++){
            System.out.println(x+"-"+month+"-"+year);
        */
        int x = day;
                int y =1;
                while(x <= dayinmonth && y <=10){
                    System.out.println(x+"-"+month+"-"+year);
                    x++;
                    y++;
        }
    }

    public static void myFlow2() {
        
        int day = 11, month = 11, year = 2011;
        System.out.println("Date: "+day+"-"+month+"-"+year);
        
        int dayinmonth;
        if(year % 4 == 0) {
        switch (month) {
            case 1 : dayinmonth = 31; break;
            case 2 : dayinmonth = 29; break;
            case 3 : dayinmonth = 31; break;
            case 4 : dayinmonth = 30; break;
            case 5 : dayinmonth = 31; break;
            case 6 : dayinmonth = 30; break;
            case 7 : dayinmonth = 31; break;
            case 8 : dayinmonth = 31; break;
            case 9 : dayinmonth = 30; break;
            case 10 : dayinmonth = 31; break;
            case 11 : dayinmonth = 30; break;
            case 12 : dayinmonth = 31; break;
            default : dayinmonth = 0; break;
            
            }
        }
        else {
            switch (month) {
            case 1 : dayinmonth = 31; break;
            case 2 : dayinmonth = 28; break;
            case 3 : dayinmonth = 31; break;
            case 4 : dayinmonth = 30; break;
            case 5 : dayinmonth = 31; break;
            case 6 : dayinmonth = 30; break;
            case 7 : dayinmonth = 31; break;
            case 8 : dayinmonth = 31; break;
            case 9 : dayinmonth = 30; break;
            case 10 : dayinmonth = 31; break;
            case 11 : dayinmonth = 30; break;
            case 12 : dayinmonth = 31; break;
            default : dayinmonth = 0; break;
            
            }
        }
        System.out.println(dayinmonth+" number of day");
        
        /* for(int x = day; x <= dayinmonth;x++){
            System.out.println(x+"-"+month+"-"+year);
        */
        int x = day;
                int y =1;
                while(x <= dayinmonth && y <=10){
                    System.out.println(x+"-"+month+"-"+year);
                    x++;
                    y++;
        }  
    }
}
