import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ran = Integer.parseInt(br.readLine());

		for(int i = 1; i <= ran; i++) {
		
			if(i % 2 == 0)
				System.out.println("Cube of " + i + " : " + i*i*i + " and Square of " + i + " : " + i*i);
		}	
	} 
}
