/* pattern
 *
 * A B
 * A B C
 * A B C D
 * A B C D E
 * A B C D E F
 */

class Prog5{
	
	public static void main(String[] args){
		
		for(int i=0; i<6; i++){
			
			int ch = 'A';
			for(int j=0; j<=i; j++){
				
				if( i == 0)
					break;
				else{
				
					System.out.print(" "+(char)ch);
					ch++;
				}
			}
			System.out.println();
		}
	}
}
