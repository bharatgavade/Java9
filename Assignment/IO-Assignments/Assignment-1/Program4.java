/*
Question 4. Write a program to take input of 3 numbers using BufferedReader class and print them
in ascending and descending order.
        Input:
                6 50 33
        Output:
                Ascending order is: 6 33 50.
                Descending order is: 50 33 6.
                Note: Do not sort. Use if-else to set min, mid and max and print accordingly. */

import java.io.*;
class Pro4 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter 1st and 2nd and 3rd Number : ");
        int a =Integer.parseInt(br.readLine());
        int b   =Integer.parseInt(br.readLine());
        int c   =Integer.parseInt(br.readLine());
        
                    if((a>=b)&&(a>=c)){
                        if(b>=c){
                            System.out.println("Descending order : "+a+" "+b+" "+c);
                            System.out.println("Ascending order : "+c+" "+b+" "+a);
                        }
                        else{
                            System.out.println("Descending order : "+a+" "+c+" "+b);
                            System.out.println("Ascending order : "+b+" "+c+" "+a);
                        }
                    }else if((b>=a)&&(b>=c)){
                        if(a>=c){
                            System.out.println("Descending order : "+b+" "+a+" "+c);
                            System.out.print("Ascending order : "+c+" "+a+" "+b);
                        }else{
                            System.out.println("Descending order : "+b+" "+c+" "+a);
                            System.out.println("Ascending order : "+a+" "+c+" "+b);
                        }
                    }else if((c>=a)&&(c>=b)){
                        if(a>=b){
                            System.out.println(" Descending order : "+c+" "+a+" "+b);
                            System.out.println("Ascending order : "+b+" "+a+" "+c);
                        }else{
                            System.out.println("Descending order : "+c+" "+b+" "+a);
                            System.out.println("Ascending order : "+a+" "+b+" "+c);
                        }
                    }                         
        }
}



