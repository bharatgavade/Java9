/* write a program to print jagged array of cubes of numbers from 10 to 1
 * use for loop ti initialise the array and print it
 * ip: 
 * op:	1000 729
 * 	512 343 216 125 64 27
 * 	8  1 
 */

import java.util.*;
class Prog1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		 arr[0] = new int[] {10,9};
		 arr[1] = new int[] {8,7,6,5,4,3};
		 arr[2] = new int[] {2,1};

		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+(arr[i][j]*arr[i][j]*arr[i][j]));
			}
			System.out.println();
		}

	}
}
