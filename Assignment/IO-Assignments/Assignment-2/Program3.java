/*
Question 3. Write a program in java to take single character as input and check whether the entered
character as vowel or consonant.
        Input:
                a
        Output:
                a is Vowel.
        Input :
                V
        Output :
                V is a consonant           */
                
import java.io.*;
class Pro3 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print("Enter a charater : ");
        char ch =(char)br.read();
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                System.out.println(ch+" is Vowel");
        else
                System.out.println(ch+" is a consonant");
                         
        }

}
