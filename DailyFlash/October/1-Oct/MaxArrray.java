import java.util.*;

class Max{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();

		System.out.println("Enter the elements :");
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}

		int max = 0;
		for(int i=0; i<size; i++){
			
			if(arr[i] > max)
				max = arr[i];
		}

		System.out.println("The max element of array is : "+max);
	}
}
