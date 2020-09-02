/*

a
A A
a a a
A A A A
a a a a a

*/

class Program {

	public static void main(String[] args) {
	
		for(int i = 0; i < 5; i++) {
		
			for(int j = 0; j <= i; j++) {
			
				System.out.print((i % 2 == 0 ? 'a' : 'A') + " ");
			}
			System.out.println();
		}	
	} 
}
