//Print Factorial in range use two user from inputs
import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ran1,ran2;
		System.out.print("Min of series : ");
		ran1 = Integer.parseInt(br.readLine());	
		System.out.print("Max of series : ");
		ran2 = Integer.parseInt(br.readLine());
		for(int i=ran1;i<=ran2;i++){
		int aa=i,fact=1;
		
			for(int j=1;j<=aa;j++){
				fact*=j;
			
			}System.out.println("Factorial of "+aa+" = "+fact);
		}	
		
	} 
}
