import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 10; i++)
			System.out.print(i*num + " ");
		System.out.println();
	}
}
