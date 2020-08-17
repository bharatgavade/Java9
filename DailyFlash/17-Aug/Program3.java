/*
Write a program to find whether the number is Even or Odd.
        Input : 4
        Output : 4 is an Even Number!
*/
import java.util.Scanner;
class Pro3{
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        
        
        if(num%2==0)
                System.out.println(num+" is an Even Number!");
        else
                System.out.println(num+" is an Odd Number!");
        
        }
}
