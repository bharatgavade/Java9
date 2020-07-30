/*Write a java program to get user and show corresponding Indian state Name switch case .
(take minimum 5 cases)
        INPUT : RTO Code : AP
        OUTPUT : State Name : Andra-Pradesh
*/
import java.util.*;

class RTO{
        public static void main(String[] args){
                Scanner sc =new Scanner(System.in);
                System.out.println("RTO Code (MH,TN,JK,AP,MP,PB) : ");
                String s=sc.next();
                switch(s){
                        case "MH" :
                                System.out.println("State Name : Maharashtra");
                                break;
                        case "TN" :
                                System.out.println("State Name : Tamil Nadu");
                                break;
                        case "JK" :
                                System.out.println("State Name : jammu kashmir ");
                                break;
                        case "AP" :
                                System.out.println("State Name : Andra-Pradesh");
                                break;
                        case "MP" :
                                System.out.println("State Name : Madhya-Pradesh");
                                break;
                        case "PB" :
                                System.out.println("State Name : Punjab");
                                break;
                        default:
                                System.out.println("Sorry!!! Plz Check the State Name");
                                return;
                 }
        }
}
                

