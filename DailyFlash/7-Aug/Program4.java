/*
Write a program and prints maximum digit from that number.
Input : 12957798
Output : the maximum Digit from number 12957798 is 9
*/
import java.util.Scanner;
class Pro4{
        public static void main(String arg[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int a = sc.nextInt();
                int num = a;
                int rem, Larg= 0;
                            while (num > 0){
                                rem = num % 10;
                                if (Larg< rem){
                                    Larg= rem;
                                }
                                num = num / 10;
                            }
                System.out.println("the maximum Digit from number "+a+" is "+Larg);
        }
}
