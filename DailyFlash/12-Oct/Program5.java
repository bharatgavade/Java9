/* Accept a string from user and take a hardcoded string. print both the strings seperated by one sngle quote*/

import java.io.*;

class Prog5{
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter string :");
		String s1 = br.readLine();

		String s2 = new String("WOW");

		System.out.println(" "+s1+" ' "+" "+s2);
	}
}
