/*

1
4 9
16 25 36
49 64 81 100

*/

class Prog4 {

	public static void main(String[] args) {
	int a=1;
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j <= i; j++) {
			
				System.out.print(a*a+" ");
				a++;
			}
			System.out.println();
		}	
	} 
}
