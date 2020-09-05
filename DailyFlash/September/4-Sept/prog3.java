// find Area of Rectangle
import java.io.*;

class Prog3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] sNum = br.readLine().split(" ");
		int[] iNum = new int[sNum.length];
		for(int i = 0; i < sNum.length; i++) {
		
			iNum[i] = Integer.parseInt(sNum[i]);
		} 

		System.out.println("Area of Rectangle = " + (iNum[0] * iNum[1]));
	}
}
