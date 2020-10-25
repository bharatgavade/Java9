/* write two array perform multiplication of same index of two array and stored result in third array and display
 * ar1 : 1 4 3 2 5 6
 * ar2 : 1 2 3 4 5 6
 * ar2 : 1 8 9 8 25 36
 *
 */

import java.util.*;

class Mul{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		int[] arr3 = new int[size];

		System.out.println("enter the elements in array 1 :");
		for(int i=0 ;i <size; i++){
			
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the elements in array 2 :");
		for(int i=0 ;i <size; i++){
			
			arr2[i]=sc.nextInt();
		}

		for(int i=0; i<size; i++){
			
			arr3[i] = arr1[i]*arr2[i];
		}
		
		System.out.println(" the elements in array 1 are :");
		for(int i=0 ;i <size; i++){
			
			System.out.println(" "+arr1[i]);
		}
		
		System.out.println(" the elements in array 2 are :");
		for(int i=0 ;i <size; i++){
			
			System.out.println(" "+arr2[i]);
		}
		
		System.out.println(" the elements in array 3 are :");
		for(int i=0 ;i <size; i++){
			
			System.out.println(" "+arr3[i]);
		}

	}
}
