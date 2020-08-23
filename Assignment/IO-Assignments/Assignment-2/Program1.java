/*
Question 1. Write a program to take 2 numbers n1 and n2 as input from user. Using switch case and
function do the following operations :
1. Addition
2. Subtraction
3. Division
4. Multiplication
*/
import java.io.*;
class Pro1 {
        public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter 1st Number : ");
        int num1 = Integer.parseInt(br.readLine());
        
        System.out.print("Enter 2nd Number : ");
        int num2 = Integer.parseInt(br.readLine());
        
        
        
        System.out.print("Enter choice Number (1.Addition 2.Substraction 3.Division 4.Multiplication): ");
        int ch = Integer.parseInt(br.readLine());
        
        switch(ch){
                case 1:
                        System.out.println("Addition "+num1+"+ "+num2+" ="+(num1+num2));
                        break;
                case 2:
                        System.out.println("Substraction "+num1+"- "+num2+" ="+(num1-num2));
                        break;
                case 3:
                        System.out.println("Division "+num1+"/ "+num2+" ="+(num1/num2));
                        break;
                case 4:
                        System.out.println("Multiplication "+num1+"* "+num2+" ="+(num1*num2));
                        break;
                default:
                        System.out.println("Plz Enter right choice");
                        break;
                       // return(ch);
        
        }
       
       
        
      }
}
        
        
