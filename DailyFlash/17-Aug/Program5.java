/*
Write a program to check whether the number is divisible by 5 & 11 or not.
        Input : 55
        Output :
                55 is divisible by 5 & 11
*/
import java.util.Scanner;
class Pro5{
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        
        
        if(num%5==0 && num%11==0)
                System.out.println(num+" is divisible by 5 & 11");
        else
                System.out.println(num+" is NOT divisible by 5 & 11");
        
        }
}
