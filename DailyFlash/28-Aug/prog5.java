/*
Factorial Program :

*/
import java.io.*;

class Program {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int fact = 1;
		for(int i = 1; i <= num; i++) 
			fact *= i;

		System.out.println("The Factorial of " + num + " is : " + fact);
	}
}
