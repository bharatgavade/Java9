import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int I = Integer.parseInt(br.readLine());
		int R = Integer.parseInt(br.readLine());
	
		System.out.println("Voltage V "+I*R);
	} 
}
