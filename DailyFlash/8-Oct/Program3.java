/* write program for 2D jagged array and print the sum of all elements
 *
 * 1 2
 * 3 4 5 6
 * 7 8
 *
 * sum = 36
 *
 */

class Prog3{
		
	public static void main(String[] args){
		
		int[][] arr = new int[3][];

		arr[0] = new int[]{1,2};
		arr[1] = new int[]{3,4,5,6};
		arr[2] = new int[]{7,8};

		int sum  = 0;
		//System.out.println(" array contains :");
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				sum = sum + arr[i][j];
			}
		
		}
		
		System.out.println(" array contains :");
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+arr[i][j]);
			}
		System.out.println();
		}

		System.out.println("Sum is :"+sum);
		
	}
}
