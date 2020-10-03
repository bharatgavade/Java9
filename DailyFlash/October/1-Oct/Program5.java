/* take size of array form user create two array of that size intialize all second array elements as zero(0) for first array take all elements from user. chake if element in first array is even or not if its even then replace the value of second array of that index with -1 and print both the arrays
 * test case : size of array should be odd
 */

import java.util.*;

class Fill{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int size = 0;
		while(true){
		System.out.println("Enter the size of array :");
		 size = sc.nextInt();
			
			if(size % 2 == 0){
				System.out.println("Please enter odd number");
				System.out.println("*************************************************************************");
			} else 
				break;
		}

		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		System.out.println("Enter the elements of first array :");
		for(int i=0; i<size; i++){
			
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements of second array :");
		for(int i=0; i<size; i++){
			
			arr2[i] = 0;
		}
		
		System.out.println(" the elements of first array are :");
		for(int i=0; i<size; i++){
			
			System.out.print(arr1[i]+" ");
			System.out.println();
		}
		
		System.out.println(" the elements of second array :");
		for(int i=0; i<size; i++){
			
			System.out.print(arr2[i]+" ");
			System.out.println();
		}

		for(int i=0; i<size; i++){
			
			if( arr1[i] % 2 == 0)
				arr2[i] = -1;
		}
		
		System.out.println(" Now the elements of first array are :");
		for(int i=0; i<size; i++){
			
			System.out.print(arr1[i]+" ");
			System.out.println();
		}
		
		System.out.println(" Now the elements of second array :");
		for(int i=0; i<size; i++){
			
			System.out.print(arr2[i]+" ");
			System.out.println();
		}
	}
}
