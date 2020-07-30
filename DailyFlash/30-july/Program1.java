/* write a java program to get two numbers and one operator from user and perform calculator 
        operations (+,-,*,/,%) on numbers using switch case.
        INPUT : 10 20 +
        OUTPUT : 30
       */
import java.util.Scanner;
class Pro1{
        public static void main(String args[]){
        
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two numbers: ");
                
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                char opr = sc.next().charAt(0);
                switch(opr){
                        case '+':
                                System.out.println(a+b);
                                break;
                        case '-':
                                System.out.println(a-b);
                                break;
                        case '*':
                                System.out.println(a*b);
                                break;
                        case '/':
                                System.out.println(a/b);
                                break;
                        case '%':
                                double  c;
                                c = a%b;
                                System.out.println(c);
                                break;
                        default:
                                System.out.printf("This is not an operator ");
                                
                        }
                }
 }
