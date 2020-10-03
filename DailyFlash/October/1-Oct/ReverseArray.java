import java.util.*;

class Reverse{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();

		System.out.println("Enter the elements :");
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}

		System.out.println("The element in reverse is :");
		for(int i=size-1;i>=0; i--){
			
			System.out.print(arr[i]+"\t");
		}
	}
}
