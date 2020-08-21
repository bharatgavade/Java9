//Write a program to ASCII values of input charater

import java.io.*;
class Ascii {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("Enter charater : ");
		char ch= (char)br.read();
		
		System.out.println("Ascii Value of "+ch+" is : "+(int)ch);
                
	}
}
