/* write a java program that accepts 3D array of plane row and col and print that array in matrix form and print only even numers
 * eg : plane : 2
 * 	row : 2
 * 	col : 2
 * 	elements : 20 22 35 36 45 67 88 55
 * 	even numbers : 20 22 36 88
 *
 */

import java.util.*;

class Prog4{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of planes :");
		int plane = sc.nextInt();
		
		System.out.println("Enter number of rows :");
		int row = sc.nextInt();
		
		System.out.println("Enter number of colms :");
		int col = sc.nextInt();

		int[][][] arr = new int[plane][row][col];

		System.out.println("Enter the elements :");
		for(int i=0; i<plane; i++){
			
			for(int j=0; j<row; j++){
				
				for(int k=0; k<col; k++){
					
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("The array is :");
		for(int i=0; i<plane; i++){
			
			for(int j=0; j<row; j++){
				
				for(int k=0; k<col; k++){
					
					System.out.print(" "+arr[i][j][k]); 
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Even numbers are :");
		for(int i=0; i<plane; i++){
			
			for(int j=0; j<row; j++){
				
				for(int k=0; k<col; k++){
					
					if( arr[i][j][k] %2 == 0)
						System.out.print(" "+arr[i][j][k]); 
				}
				//System.out.println();
			}
			//System.out.println();
		}
			System.out.println();
	}
}
