/* write a java program that create a jagged array with 3 rows . ask the user for input for number of colms in each row . pass the given input values to the array and takes input for the array and print the array.
 * iP: col for 1 row = 2
 *     col for 2 row = 3
 *     col for 3  row = 2;
 *
 *     op: 1 2
 *     	   3 4 5
 *     	   6 6
 */

import java.util.*;
class Prog5{
	
	public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][3];

		System.out.println("Enter number of colms for 1 row :");
		int col0 = sc.nextInt();
		
		System.out.println("Enter number of colms for 2 row :");
		int col1 = sc.nextInt();
	
		System.out.println("Enter number of colms for 3 row :");
		int col2 = sc.nextInt();

		arr[0] = new int[col0];
		arr[1] = new int[col1];
		arr[2] = new int[col2];

		System.out.println("Enter the elements :");
		for(int i=0; i<arr.length; i++){
				
			for(int j=0; j<arr[i].length; j++){
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(" the elements of array are :");
		for(int i=0; i<arr.length; i++){
				
			for(int j=0; j<arr[i].length; j++){
				
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
