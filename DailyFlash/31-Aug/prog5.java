// perfect Divisiors form input
import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());

		System.out.print("Perfect Divisors of " + num + " are : ");
		for(int i = 2; i < num; i++) {
		
			if(num % i == 0) {
			
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
