// write a program to chake whether the given character is alphabet or digit or sp character

class Chake {
	
	public static void main(String[] args){
		
		char ch = '*';

		if((ch >= 65 && ch <= 90) || ( ch >= 97 && ch <= 122))
			System.out.println(""+ch+" is an alphabet");
		else if( ch>=48 && ch<=57 )
		       System.out.println(""+ch+" is a Digit");
			else 
				System.out.println(""+ch+" is a special character");
		
	}
}
