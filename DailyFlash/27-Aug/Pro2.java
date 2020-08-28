import java.io.*;

class Pro2{

	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
		
		System.out.println("Enter two numbers :"); 
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Multiplication is = "+(a*b));
		if(a>b)
			System.out.println("Division is = "+(a/b));
		else
			System.out.println("Division is = "+(b/a));
	}
}