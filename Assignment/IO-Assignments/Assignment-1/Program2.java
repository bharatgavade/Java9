/*
Question 2. Write a program in java for class IPL that contains:
1. Team name
2. Captain name
3. Best win percentage
4. Number of Indian batsmen
5. Number of International batsmen
Take input forabove fields using BufferedReader class and display them as follows:
        Input:
                CSK
                Mahendra Singh Dhoni
                61.28
                6
                3
        Ouput:
                The IPL team name is: CSK
                It’s captain is: Mahendra Singh Dhoni
                It has the best win percentage of: 61.28
                Number of Indian batsmen are: 6
                Number of International batsmen are: 3      */
                
import java.io.*;
class Pro2 {
        public static void main(String [] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Team name : ");
        String s =br.readLine();
        
        System.out.print("Enter Captain name : ");
        String s2 =br.readLine();
        
        System.out.print("Enter Best win percentage : ");
        float f =Float.parseFloat(br.readLine());
        
        System.out.print("Enter Number of Indian batsmen : ");
        int i =Integer.parseInt(br.readLine());
        
        System.out.print("Enter Number of International batsmen : ");
        int i2 =Integer.parseInt(br.readLine());
        
        
                System.out.println("The IPL team name is: "+s);
                System.out.println("It’s captain is:" +s2);
                System.out.println("It has the best win percentage of: " +f);
                System.out.println("Number of Indian batsmen are: "+i);
                System.out.println("Number of International batsmen are: "+i2); 
        
        
        }

}
