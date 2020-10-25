/* write program for 2D jagged array and print the even no. of all elements
 *
 * 1 2 3
 * 4 5
 * 6 7 8 9 10
 *
 * even no . = 2 4 6 8 10
 *
 */

class Prog4{
		
	public static void main(String[] args){
		
		int[][] arr = new int[3][];

		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{4,5};
		arr[2] = new int[]{6,7,8,9,10};

	
		System.out.println(" array contains :");
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+arr[i][j]);
			}
		System.out.println();
		}
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				if(arr[i][j]%2 == 0)
					System.out.println("Even no. are :"+arr[i][j]);
			}
		
		}
		
	}
}
