/* write a program to print jagged array of squares of numbers from 1 to 10
 * use for loop to initialise the array and print it
 * ip: 
 * op:	1 4 9 16
 * 	25 36
 * 	49 64 81 100
 */

import java.util.*;
class Prog2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		 arr[0] = new int[] {1,2,3,4};
		 arr[1] = new int[] {5,6};
		 arr[2] = new int[] {7,8,9,10};

		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+(arr[i][j]*arr[i][j]));
			}
			System.out.println();
		}

	}
}
