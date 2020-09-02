//Swap Between two numbers form input

import java.io.*;

class Program {

	static int num1,num2;

	static void swap(int n1, int n2) {
	
		num1 = n2;
		num2 = n1;
	}

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		
		System.out.println("Before Swap : " + num1 + " " + num2);	
		swap(num1,num2);
		System.out.println("After Swap : " + num1 + " " + num2);	
	} 
}
