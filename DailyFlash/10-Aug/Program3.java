/*
Write a java program to take a number as input and print series of prime number ranging up to that number from 1.
        Input : 20
        Output :
                2 3 5 7 11 13 17 19
*/
import java.util.Scanner;
class Pro3{
        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        
                for (int i=1;i<=num;i++){
                int count= 0;
                        for (int j=1;j<=i;j++){
                                if(i%j==0){
                                        count+=1;
                                }
                        }
                        if(count==2)
                                System.out.print(i+" ");
                        
                }
        }
}
