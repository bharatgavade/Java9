import java.io.*;

class Area{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the length of Square :");
		int len = Integer.parseInt(br.readLine());

		int Area = len*len;

		int Perimeter = 4 * len;

		System.out.println(" Area : "+Area+" Perimeter : "+Perimeter);
	}
}
