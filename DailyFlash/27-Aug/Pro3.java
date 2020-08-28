import java.io.*;

class Pro3{

	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		System.out.println("Enter two numbers :"); 
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int s1 = n1*n1;
		int c1 = s1*n1;
		int s2 = n2*n2;
		int c2 = s2*n2;
		System.out.println("Subtraction of "+s1+" & "+s2+" is "+(s1-s2));
		
		System.out.println("Addition of "+c1+" & "+c2+" is "+(c1+c2));

	}
}