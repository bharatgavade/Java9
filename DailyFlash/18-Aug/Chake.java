// write a program to chake whether the given character is alphabet or not

class Chake {
	
	public static void main(String[] args){
		
		char ch = 'v';

		if((ch >= 65 && ch <= 90) || ( ch >= 97 && ch <= 122))
			System.out.println(""+ch+" is an alphabet");
		else 
			System.out.println(""+ch+" is not an alphabet ");
	}
}
