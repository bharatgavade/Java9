import java.io.*;
class Factorial{
	
	public static void main(String[] arsg) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int fact ;
		System.out.println("Enter the Upper limit :");
		int upLimit = Integer.parseInt(br.readLine());

		System.out.println("Enter the lower limit :");
		int lwLimit = Integer.parseInt(br.readLine());

		System.out.println("The factoaials are :");

		for(int i = upLimit; i<= lwLimit; i++){
			
			fact = 1;
			for(int j=1; j<=i; j++){
				
				fact = fact*j;
			}

			System.out.println("Factorial of "+i+" is : "+fact);
		}

		
	}
}
