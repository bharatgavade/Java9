/* write code that accepts 2D array print 2D array in matrix form and print hour glass structure
 *  1  2  3  4
 *  5  6  7  8
 *  9  10 11 12
 *
 * hour glass structure is :
 *
 * 1 2 3	2  3  4
 *   6 		   7
 * 8 9 10	10 11 12
 */

import java.io.*;

class ArrayDemo{
	
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice = 0;
		System.out.println("Enter size for row :");
		int Rsize = Integer.parseInt(br.readLine());
		
		System.out.println("Enter size for col :");
		int Csize = Integer.parseInt(br.readLine());

		int [][]arr = new int[Rsize][Csize];

		System.out.println("Enter the elements :");
		for(int i=0; i<Rsize; i++){
			
			for(int j=0; j<Csize; j++){
				
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println(" The elements are :");
		for(int i=0; i<Rsize; i++){
			
			for(int j=0; j<Csize; j++){
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();		
		
		while(choice != 3){
		System.out.println(" 1 :Hour glass Structure form 0 row ");
		System.out.println(" 2 :Hour glass Structure form 1 row ");
		System.out.println(" 3 : Exit ");

		System.out.println("Enter your choice");
		 choice = Integer.parseInt(br.readLine());

		switch(choice){
			
			case 1 :
				System.out.println();
				for(int i=0; i<Rsize; i++){
				
					for(int j=0; j<Csize; j++){
				
						if( j>=0 && j<3){
					
							if(i == 1){
					
								if(i == 1 && j == 1){
						
									System.out.print(arr[i][j]+" ");
								} else {
							
									System.out.print("  ");
								}
							} else{
					
								System.out.print(arr[i][j]+" ");
							}
						}
					}
						System.out.println();
					}
				break;
				
			case 2 :
				System.out.println();
				for(int i=0; i<Rsize; i++){
				
					for(int j=0; j<Csize; j++){
				
						if( j>=1 && j<=3){
					
							if(i == 1){
					
								if(i == 1 && j == 2){
						
									System.out.print(arr[i][j]+" ");
								} else {
							
									System.out.print("  ");
								}
							} else{
					
								System.out.print(arr[i][j]+" ");
							}
						}
					}
						System.out.println();
					}
				break;
			}
		}		
	
	}

	
}
