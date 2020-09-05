//second predecessor and successor form input number
import java.io.*;

class Prog2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		System.out.println("Second Predecessor = " + (num - 2));
		System.out.println("Second Successor = " + (num + 2));
	}
}
