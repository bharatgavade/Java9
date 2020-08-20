import java.io.*;
class Pro2{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		float num1,num2,num3;
                System.out.print("principal amount : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("Rate : ");
		num2 = Integer.parseInt(br.readLine());
		System.out.print("Time : ");
		num3 = Integer.parseInt(br.readLine());
		
		System.out.println("simple interest : "+(num1*num2*num3)/100);
                
                
	}
}
