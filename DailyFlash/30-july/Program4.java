/* Write a java program to take a any number (0-9 only) form user (int type) and print the entered number in word from using switch case.
        INPUT : 0
        OUTPUT :Zero
*/
import java.util.*;
class Number{
        public static void main(String args[]){
                Scanner sc =new Scanner(System.in);
                int num = sc.nextInt();
                switch(num){
                        case 1:
                                System.out.println("ONE");
                                break;
                        case 2:
                                System.out.println("TWO");
                                break;
                        case 3:
                                System.out.println("THREE");
                                break;
                        case 4:
                                System.out.println("FOUR");
                                break;
                        case 5:
                                System.out.println("FIVE");
                                break;
                        case 6:
                                System.out.println("SIX");
                                break;
                        case 7:
                                System.out.println("SEVEN");
                                break;
                        case 8:
                                System.out.println("EIGHT");
                                break;
                        case 9:
                                System.out.println("NINE");
                                break;
                        default:
                                System.out.println("Sorry! only Integer number and range is 1 to 9");
                                break;
                 }
        }
}
                
