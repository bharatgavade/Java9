// user from input to print table in revers
import java.io.*;

class Prog1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for(int i = 10; i > 0; i--) {
		
			System.out.printf("%d X %d = %d\n",num,i,num * i);
		}
	}
}
