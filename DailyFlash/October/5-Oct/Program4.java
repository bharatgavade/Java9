/* write a java  program to insert an element at specific position in an  array 
 * array : 1 2 3 4 5
 * enter index at which you want to add element : 2
 * enter number : 2
 * array : 1 2 2 4 5
 */

import java.util.*;

class Replace{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int arr[] = {25,14,56,15,36,56,77,18,29,49};

		System.out.println("Orignal array is :");
		for(int i=0; i<10; i++){
			
			System.out.println(" "+arr[i]);
		}

		System.out.println("Enter the index at which you want to add element :");
		int pos = sc.nextInt();

		System.out.println("Enter the number you want to replace :");
		int num = sc.nextInt();

		for(int i=0; i<10; i++){
			
			if( i == pos){
				
				arr[i] = num;
			}
		}
		
		System.out.println(" Now the array is :");
		for(int i=0; i<10; i++){
			
			System.out.println(" "+arr[i]);
		}	
	}
}
