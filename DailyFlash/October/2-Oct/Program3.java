/* write code that accepts 2D array print 2D array in matrix form and print addition of all rows and colms
 *  1 2 3	
 *  4 5 6
 *  7 8 9
 *
 * add row 0 : 6	add col 0 : 12
 * add row 1 : 15	add col 1 : 15
 * add row 2 : 24	add col 2 : 18
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
		
		int Rsum0 = 0,Rsum1 = 0,Rsum2 = 0;
		int Csum0 = 0,Csum1 = 0,Csum2 = 0;
		for(int i=0; i<size; i++){

			for(int j=0; j<size; j++){
				
				Rsum0 = arr[0][0] + arr[0][1] + arr[0][2];
				Rsum1 = arr[1][0] + arr[1][1] + arr[1][2];
				Rsum2 = arr[2][0] + arr[2][1] + arr[2][2];
			
				Csum0 = arr[0][0] + arr[1][0] + arr[2][0];
				Csum1 = arr[0][1] + arr[1][1] + arr[2][1];
				Csum2 = arr[0][2] + arr[1][2] + arr[2][2];
					
					
				}
				
			}
		
		System.out.println("Addition of row0 : "+Rsum0 );
		System.out.println("Addition of row1 : "+Rsum1 );
		System.out.println("Addition of row2 : "+Rsum2 );
		System.out.println("");
		System.out.println("Addition of col0 : "+Csum0);
		System.out.println("Addition of col1 : "+Csum1);
		System.out.println("Addition of col2 : "+Csum2);
	}

	
}
