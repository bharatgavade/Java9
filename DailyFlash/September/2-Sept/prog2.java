//Print Minimum number amongs for two inputs
import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
	
		System.out.println("The Minimum number amongst " + num1 + " & " + num2 + " is " + (num1 < num2 ? num1 : num2));
	} 
}
