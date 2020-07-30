/*Write a java program to get any input character from user and display any corresponding programming language using switch case. (take minimum 5 case)
        INPUT : Enter character : J
        OUTPUT : Language : Java  */
import java.util.*;

class Language{
        public static void main(String args[]){
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter character(J,C,P,R,S) :");
                //char a = sc.next().charAt(0);
                char ch = sc.next().charAt(0);
                
                switch(ch){
                        case 'J':
                                System.out.println("Language : Java");
                                break;       
                        case 'C':
                                System.out.println("Language : C");
                                break;
                        case 'P':
                                System.out.println("Language : Python");
                                break;
                        case 'R':
                                System.out.println("Language : R");
                                break;
                        case 'S':
                                System.out.println("Language : SQL");
                                break;
                        default:
                                System.out.println("Sorry! Wrong Character");
                                return;
                        }
        }
}
                
                
