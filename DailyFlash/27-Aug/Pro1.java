import java.io.*;

class Pro1{

	public static void main(String[] args) throws Exception{
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		System.out.println("Enter two numbers :"); 
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Addition is = "+(a+b));
		if(a>b)
			System.out.println("Subtraction is = "+(a-b));
		else
			System.out.println("Subtraction is = "+(b-a));
	}
}