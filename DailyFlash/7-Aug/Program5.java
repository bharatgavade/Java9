/*
Write A proram and print avrage of all number.
Input : 12345
Output : The avrage of digits from number 12345 is 3.
*/
import java.util.Scanner;
class Pro5{
        public static void main(String arg[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int a = sc.nextInt();
                
                int sum=0,num,count=0, number=a ;
                
                while(a!=0){
                        num =a%10;
                        sum= sum+num;
                        a/=10;
                        count++;
                }
                System.out.println("The avrage of digits from number"+ number+ " is " +(sum/count));
        }
}
