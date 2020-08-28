import java.io.*;

class Calculator{

	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		System.out.println("Enter two numbers :"); 
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter Operator:"); 
		char c = ( char )br.read();
		
		switch(c){
			case '+':
				System.out.println("Addition is = "+(a+b));
				break;
			case '-':
				System.out.println("Subtraction is = "+(a-b));
				break;
			case '*':
				System.out.println("Multiplication is = "+(a*b));
				break;
			case '/':
				System.out.println("Division is = "+(a/b));
				break;
			default:
				System.out.println("Plz enter valid value !!!");
				break;
		}
	}
}