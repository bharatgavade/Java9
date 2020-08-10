/*
Write a java program to take a number as input and print series of factorial number ranging up to that number from 1.
        Input : 20
        Output :
                Factorial of 1 : 2
                Factorial of 2 : 2
                .
                .
                .
                Factorial of 10 : 3628800 
*/
import java.util.Scanner;
class Pro4{
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
                long fact =1;
                
                for (int i=1;i<=num;i++){
                        fact = fact * i;
                        System.out.println("Factorial of "+i+" : "+fact);
                        
                }
        }
}
