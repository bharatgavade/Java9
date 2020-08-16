/*
Program 1: Write a code in Java, to determine whether the given random year is leap.
*/

class Pro1{
        public static void main(String args[]){
        
        int year = 2004;
        if (year % 4 ==0){
               if(year % 100 == 0){
                        if(year % 400 == 0)
                                System.out.println(year +" This year is Leap year");
                        else
                                System.out.println(year +" This year is NOT Leap year");
                }
                System.out.println(year +" This year is Leap year");    
        }
       }
 }
