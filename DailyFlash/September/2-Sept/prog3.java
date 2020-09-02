import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dis = Integer.parseInt(br.readLine());
		int time = Integer.parseInt(br.readLine());
	
		System.out.println("The Velocity of a Particle roaming In space is "+dis/time+"m/s");
	} 
}
