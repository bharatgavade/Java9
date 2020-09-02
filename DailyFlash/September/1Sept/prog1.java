//print odd number range form input max and min

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ran1,ran2;
		System.out.print("Min of series : ");
		ran1 = Integer.parseInt(br.readLine());	
		System.out.print("Max of series : ");
		ran2 = Integer.parseInt(br.readLine());

		System.out.println("Series of Odd Numbers ranging between " + ran1 + " & " + ran2 + " is : ");

		for(int i = ran1; i <= ran2; i++) {
		
			if(i % 2 != 0)
				System.out.print(i + " ");
		}	
		System.out.println();
	} 
}
