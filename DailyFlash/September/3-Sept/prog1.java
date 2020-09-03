//print check perfect Number or not

import java.io.*;

class Prog1 {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter A number : ");
		int num = Integer.parseInt(br.readLine());	
		int i=1,sum=0;
		
		while(i<num){
			if(num%i==0)
				sum+=i;
			i++;
		}
		if(sum==num)
			System.out.print("IS perfect number");
		else
			System.out.print("IS not perfect number");
	} 
}
