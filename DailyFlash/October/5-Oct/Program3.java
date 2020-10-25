/* write a program that accepts 2D array  and perform addition of that element are stored in  third array and print it
 * eg : 1 2	1 2
 * 	3 4	3 4
 *
 * 	op : 2 4 
 * 	     6 8 
 */

class Add{
	
	public static void main(String[] args){
	
		int arr1[][] = {{1,2},{3,4}};
		int arr2[][] = {{1,2},{3,4}};
		int[][] arr3 = new int[2][2];

		for(int i=0; i<2; i++){
			
			for(int j=0; j<2; j++){
				
				arr3[i][j] = arr1[i][j]+arr2[i][j];
				
				}
			}
		
		System.out.println("First array :");
		for(int i=0; i<2; i++){
			
			for(int j=0; j<2; j++){
				
				System.out.print(" "+arr1[i][j]);
				
				}
			System.out.println();
			}
		
		System.out.println("Second array :");
		for(int i=0; i<2; i++){
			
			for(int j=0; j<2; j++){
				
				System.out.print(" "+arr2[i][j]);
				
				}
			System.out.println();
			}
		
		System.out.println("Third array :");
		for(int i=0; i<2; i++){
			
			for(int j=0; j<2; j++){
				
				System.out.print(" "+arr3[i][j]);
				
				}
			System.out.println();
			}
	}
}
