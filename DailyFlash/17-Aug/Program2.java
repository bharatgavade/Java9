/*
Write a program to check whether the number is negative , positive or equal to Zero.
        Input : -2
        Output: 
                -2 is the negative number
*/
import java.util.Scanner;
class Pro2{
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        
        
        if(num<0)
                System.out.println(num+" is the negative number");
        
        else if(num>0)
                System.out.println(num+" is the positive number");
        else
                System.out.println(num+" is equal to zero");
        
        }
}
