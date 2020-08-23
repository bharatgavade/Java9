/*
Question 3. Write a program to enter 2 numbers using BufferedReader class and perform basic
arithmetic calculation and print the result.
        Input:
                20 40
        Output:
                Addition of 20 and 40 is: 60
                Subtraction of 20 and 40 is: -20
                Multiplication of 20 and 40 is: 800
                Division of 20 and 40 is: 0.5           */
                
import java.io.*;
class Pro3 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter 1st Number : ");
        int i =Integer.parseInt(br.readLine());
        
        System.out.print("Enter 2nd Number  : ");
        int i2 =Integer.parseInt(br.readLine());
        
        
                System.out.println("Addition of "+i+" and "+i2+" is: "+(i+i2));
                System.out.println("Subtraction of "+i+" and "+i2+" is: " +(i-i2));
                System.out.println("Multiplication of "+i+" and "+i2+" is: " +(i*i2));
                System.out.println("Division of "+i+" and "+i2+" is: "+(i/i2));
                         
        }

}
