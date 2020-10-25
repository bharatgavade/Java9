/* write a java program that accepts 3D array of plane row and col and print that array in matrix form and print addition of element of 
 * first plane
 * eg : plane : 2
 * 	row : 2
 * 	col : 2
 * 	elements : 10 20 30 40 50 60 70 80
 * 	sum = 100
 *
 */

import java.util.*;

class Prog3{
	
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
		
		int sum = 0;
		for(int i=0; i<plane; i++){
			
			for(int j=0; j<row; j++){
				
				for(int k=0; k<col; k++){
					
					if( i<1)
						sum = sum + arr[i][j][k]; 
				}
				//System.out.println();
			}
			//System.out.println();
		}
			System.out.println();
			System.out.println("Sum is : "+sum);
	}
}
