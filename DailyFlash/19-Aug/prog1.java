import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch = (char)br.read();

		if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is in Uppercase");
		else if(ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is in Lowercase");
		else
			System.out.println("Please enter Valid Character");
	}
}
