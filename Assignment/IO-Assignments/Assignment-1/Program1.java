/*
Question 1. Write a program to take input from user for all datatypes (int, float, double, long,
boolean, char and String) using BufferedReader class and print the same.
*/
import java.io.*;
class Pro1 {
        public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter String value : ");
        String s =br.readLine();
        
        System.out.print("Enter Interger value : ");
        int i = Integer.parseInt(br.readLine());
        System.out.print("Enter Float value : ");
        float f = Float.parseFloat(br.readLine());
        
        System.out.print("Enter double value : ");
        double d = Double.parseDouble(br.readLine());
        System.out.print("Enter long value : ");
        long l = Long.parseLong(br.readLine());
        
         System.out.print("Enter boolean value : ");
        boolean b = Boolean.parseBoolean(br.readLine());
        System.out.print("Enter char value : ");
        char c = (char)br.read();
        
        
        
        
        System.out.println("String : "+s+",Char : "+c+",Boolean : "+b+",Long : "+l+",Double : "+d+",Float : "+f+",Integer : "+i);
       
        
      }
}
        
        
