/*Question 5. Write a program to take input of 2 numbers and print all the prime numbers ranging
between them and print their count.
Note: If there are no numbers to print then print a message that indicates the same.
        Input:
                0 30
        Output:
                2 3 5 7 11 13 17 19 23 29
                The count is: 10
        Input:
                8 10
        Output:
                The count is: 0
                No prime numbers to display.    */
                
import java.io.*;
class Pro5 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter 1st Number : ");
        int n =Integer.parseInt(br.readLine());
        
        
        System.out.print("Enter 2nd Number  : ");
        int num2 =Integer.parseInt(br.readLine());
        int c=0,count;
        
                for (int i = n; i  <= num2; i++) {
                    count = 0;
                         for (int j = 2; j  <= i / 2; j++) {
                                  if (i % j == 0) {
                                     count+=1;
                                     break;
                                     
                                  }                                  
                         }
                                
                        if (count == 0) {
                            System.out.print(i+" ");
                                                        
                        }
                    
                  }                          
        }
}
