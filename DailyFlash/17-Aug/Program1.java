/*
Write a program to find maximum between two numbers
        Input : 1 2
        Output :
                2 is max number among 1 & 2
*/
import java.util.Scanner;
class Pro1{
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two Number : ");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num<num2){
                System.out.println(num2 + " is Max number among "+num+ " & "+num2);
        }
        
        
        }
}
