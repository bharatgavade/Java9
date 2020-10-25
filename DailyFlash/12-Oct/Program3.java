/* strore one hardcoded string in string literal and anather one string in string object. And comment how they are stored on string constatnt
 * pool and heap */

class Prog3{
	
	public static void main(String[] args){
		
		String s1 = "HI";
		String s2 = new String("Hello");

		System.out.println(" "+s1+" "+" "+s2);
	}
}
// when string is created with string literal it get stored in string constant pool with reference
// when string is created with string new keyword it get stored in string constant pool without refernce and in heap also with reference to it
