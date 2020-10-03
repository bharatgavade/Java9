//write a program that takes marks as input and find sum
import java.util.*;

class Score{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];

		int sum = 0;
		System.out.println("Enter the score :");
		for(int i=0; i<size; i++){
			
			arr[i]=sc.nextInt();
			sum = sum + arr[i];
		}

		System.out.println("Sum : "+sum);
	}
}
