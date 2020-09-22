import java.io.*;
class Increment{
	
	public static void main(String[] arsg) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number :");
		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<50; i += num ){
			
			System.out.println(" "+i);
			
		}
	}
}
