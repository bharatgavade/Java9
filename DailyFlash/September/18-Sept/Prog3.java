import java.io.*;
class Demo{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("The users input are :");
		System.out.println(" 1 : Int");
		System.out.println(" 2 : String");

		int age;
		String name;
		System.out.println("Enter your choice :");
		int ch = Integer.parseInt(br.readLine());

		switch(ch){
			
			case 1:
				System.out.println("Enter the student age :");
				age = Integer.parseInt(br.readLine());
				break;

			case 2:
				System.out.println("Enter the student name :");
				name = br.readLine();
				break;

			default :
				System.out.println("Incorrect Choice ");
				break;
		}

	}
}
