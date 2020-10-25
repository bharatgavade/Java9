/* write program for 2D jagged array such that 1st row has 1 element 2nd row has 2 element and so on
 */

class Prog2{
		
	public static void main(String[] args){
		
		int[][] arr = new int[3][];

		arr[0] = new int[]{1};
		arr[1] = new int[]{2,3};
		arr[2] = new int[]{4,5,6};

		System.out.println(" array contains :");
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
