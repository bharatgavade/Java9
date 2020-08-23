/*
Question 2. Write a program in java to take a number as input from user and display all it’s divisors.
        Input:
                50
        Ouput:
                1 2 5 10 25      */
                
import java.io.*;
class Pro2 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        System.out.print("Enter Number : ");
        int num =Integer.parseInt(br.readLine());
                int i =1;
                while(i<num){
                        if (num%i==0)
                                System.out.print(i+" ");
                        i++;
                }
        
        }

}
