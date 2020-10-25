/* write a java program that accepts 3D array of plane row and col and aum of all elements from user and add all elements
 * eg : plane : 2
 * 	row : 2
 * 	col : 2
 * 	elements : 1 2 3 4 5 6 7 8
 * 	sum : 36
 *
 */

import java.util.*;

class Prog1{
	
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
		
		int sum = 0;
		for(int i=0; i<plane; i++){
			
			for(int j=0; j<row; j++){
				
				for(int k=0; k<col; k++){
					
					sum = sum + arr[i][j][k]; 
				}
			}
		}

		System.out.println("Sum is :"+sum);
	}
}
