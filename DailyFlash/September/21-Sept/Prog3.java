import java.io.*;
class Leap{
		
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the year :");
		int yr = Integer.parseInt(br.readLine());

		if(yr % 400==0 || (yr%100 !=0 && yr % 4 == 0))
			System.out.println(yr+" Leap Year");
		else
			System.out.println(yr+" is not a Leap Year");	
	
}
}
