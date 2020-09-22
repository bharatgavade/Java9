/*		* * *
 *	      * * *
 *	    * * *
 *
 */

class Pattern{
	
	public static void main(String[] args){

		for(int row=1; row<4; row++){
			
			for(int spc = 3; spc>=row; spc--){
				
				if( row == 1)
					System.out.print("  ");
				else
					System.out.print(" ");
			}

			for(int col=3; col>=1; col--){
				
				System.out.print(" *");
			}

			System.out.println();
		}
		
	}
}
