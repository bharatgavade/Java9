/*
Write a java program which accepts the student year and student marks & using that student year and student marks it will check student is eligible or note for Educatin scholarship by help of nested switch case.
Condition :
        In 1st switch case take parameter as student marks.
        1st and 2nd year student are not eligible for education scholarship.
        Only 3rd year student eligible for eduction scholarship.
        
        Input : 
                Student Year : 3
                Student Marks : 80
        Output :
                Student eligible for Eduction scholarship.
*/

import java.util.*;
class Pro2{
        public static void main(String a[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Student Year : ");
        int Year = sc.nextInt();
        
        
        
        switch(Year){
                case 1:
                        System.out.println("1st year student are not eligible for education scholarship.");
                        break;
                case 2:
                        System.out.println("2st year student are not eligible for education scholarship.");
                        break;
                case 3:
                        System.out.print("Student Marks : ");
                        int Marks = sc.nextInt();
        
                        //int m= Marks;
                        if(Marks >=71)
                                Marks =0;
                        else
                                Marks = 1;
                        switch(Marks){
                                
                                
                                case 0:
                                        System.out.println("Student eligible for Eduction scholarship.");
                                        break;
                                
                                case 1:
                                        System.out.println("Student are not eligible for Eduction scholarship.");
                                        break;
                                
                        
                        }
        }
      }
}
                
