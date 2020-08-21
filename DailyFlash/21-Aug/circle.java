//Write a program to calculate area of circle

import java.io.*;
class Pro1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double pi =3.14;
		
		System.out.print("Enter Redius : ");
		int radius = Integer.parseInt(br.readLine());
		double Ac= (radius*radius) * pi;
		System.out.print("Area of circle : "+Ac);
		

                
	}
}
