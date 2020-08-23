/*Question 5. Write a program to take input of a number and check whether the number is divisible by
both 5 and 10.
        Input:
                50
        Output:
                50 is divisible by both 5 and 10    */
                
import java.io.*;
class Pro5 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter Number : ");
        int n =Integer.parseInt(br.readLine());
        
        if(n%5==0 && n%10==0)
                System.out.println(n+" is divisible by both 5 and 10"); 
        else
                System.out.println(n+" is not divisible by both 5 and 10");
      
                                  
        }
}
