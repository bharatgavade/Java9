/* Write a java program to get any number from user and check whether the entered number is greter than or less than or equal to zero.
        Input : number :0
        Output : Enterd Number is equal to zero.
*/
import java.util.*;
class Num{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Number : ");
                int num = sc.nextInt();
                
                if(num < 0){
                        System.out.println("Enterd Number less than zero");
                }else if(num == 0){
                        System.out.println("Enterd Number is equal to zero");
                }else{
                        System.out.println("Enterd Number is greter than zero");
                }
         }
}
