import java.io.*;
class Largest{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first number :");
		int n1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number :");
		int n2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter third number :");
		int n3 = Integer.parseInt(br.readLine());

		int res = n1 > n2 ? n1 : ( n1 > n3 ? n1 : ( n2 > n3 ? n2 : n3));

		System.out.println(" "+res+" is largest among "+n1+" "+n2+" "+n3);
	}
}	
