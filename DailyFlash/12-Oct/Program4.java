/* use a string variable s1 to store store literal and use anather string variable s2 to store anather string object.
 * later use s1 to store string object and use s2 to store string literal . chake wheather such wapping works. */

class Prog4{
	
	public static void main(String[] args){
		
		String s1 = "Why";
		String s2 = new String("When");
		
		System.out.println(""+s1+" "+" "+s2);

		 s1 = new String("Which");
		 s2 = "what";
		
		 System.out.println(""+s1+" "+" "+s2);
	}
}
