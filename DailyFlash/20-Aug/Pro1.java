import java.io.*;
class Pro1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1,num2,num3;

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());
                
                int re = (num1*num1) + (num2*num2);
		if(re == (num3*num3))
			System.out.println("Triangle Satisfies the Pythagoarean Theorem");
		else
			System.out.println("Triangle NOT Satisfies the Pythagoarean Theorem");
	}
}
