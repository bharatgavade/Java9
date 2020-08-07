/*
Write a java program to count number of digits in a number
        Input : 12345
        Output : 5
*/
import java.util.Scanner;
class Pro1{
        public static void main(String arg[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int a = sc.nextInt();
                int count=0 ;
                
                while(a!=0){
                         a/=10;
                         count++;
                }
                System.out.println("Count Number : "+count);
        }
}
                        
