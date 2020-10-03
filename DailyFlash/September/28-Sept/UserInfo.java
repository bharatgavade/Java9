import java.util.*;

class User{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name :");
		String name = sc.next();
		System.out.println("Roll No :");
		int Roll = sc.nextInt();
		System.out.println("Field of intrest :");
		String Intrest = sc.next();

		System.out.println("Hey,my name is "+name+" and my roll no is "+Roll+" My field of intrest are "+Intrest);
	}
}
