
import java.io.*;
class Program {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1,num2,num3;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());

		if(num1 + num2 + num3 == 180)
			System.out.println("the triangle with angles "+ num1 +" "+ num2 +" & "+ num3 + " is valid one");
		else
			System.out.println("the triangle with angles "+ num1 +" "+ num2 +" & "+ num3 + " is invalid one");
	}
}
