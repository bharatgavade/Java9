/* write code that accepts 2D array print 2D array in matrix form and print diagonal element of array 
 *  1 2 3	
 *  4 5 6
 *  7 8 9
 *
 *  1 5 9
 *
 */

import java.io.*;

class ArrayDemo{
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size :");
		int size = Integer.parseInt(br.readLine());

		int [][]arr = new int[size][size];

		System.out.println("Enter the elements :");
		for(int i=0; i<size; i++){
			
			for(int j=0; j<size; j++){
				
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println(" The elements are :");
		for(int i=0; i<size; i++){
			
			for(int j=0; j<size; j++){
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(" The diagonal elements are :");
		for(int i=0; i<size; i++){
			
			for(int j=0; j<size; j++){
				
				if( i == j)
					System.out.print(arr[i][j]+" ");
				//	System.out.println();
				
			}
		}

	}
}
