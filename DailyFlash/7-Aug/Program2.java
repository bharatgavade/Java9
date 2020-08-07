/*
write a java program and print addition of even digit and multiplication of odd digit from number 
        Input : 12345
        Output : 
                Addition of even digit = 6
                Mulipliction of odd digit = 15
*/
import java.util.Scanner;
class Pro2{
        public static void main(String arg[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int a = sc.nextInt();
                int add = 0,mul = 1;
                
                
                while(a > 0){
                        if((a%10)%2==0)
                                add = add + a%10;
                        else
                                mul = mul * (a%10);
                        a= a/10;                  
                                
                }
                System.out.println("Addition of even digit : "+add);
                System.out.println("Mulipliction of odd digit : "+mul);
        }
}
