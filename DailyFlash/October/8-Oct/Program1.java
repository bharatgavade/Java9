/* write a java program for 2D jagged array from userand print the same
 */

class Prog1{
	
	public static void main(String[] args){
		
		int[][] arr = new int[3][];

		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{4};
		arr[2] = new int[]{5,6,7};

		System.out.println("The array contains :");
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}	
	}
}
