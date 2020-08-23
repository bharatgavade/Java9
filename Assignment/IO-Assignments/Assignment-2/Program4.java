/*
Question 4. Write a program to take input of 2 numbers using BufferedReader class as range1 and
range2 and print square and cube of all the numbers between that range.
        Input:
                Enter range1 : 1
                Enter range2 : 5
        Output:
                Square : 1 4 9 16 25
                Cube : 1 8 27 64 125 */

import java.io.*;
class Pro4 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter Range1 : ");
        int r1 = Integer.parseInt(br.readLine());
        
        System.out.print("Enter Range2 : ");
        int r2 = Integer.parseInt(br.readLine());
        int sq=0;
        int cu= 0;
        
        for (int i=r1;i<=r2;i++){
                sq = i *i;
                cu = sq *i;
                System.out.print(sq+" ");
                System.out.println(cu+" ");        
                
        }
        
        
                                 
        }
}



