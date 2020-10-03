import java.util.*;

class Sum{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();

		System.out.println("Enter the elements :");
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for(int i=0;i<size; i++){
			
			sum = sum + arr[i];
		}

		System.out.println("The sum of all elemets is : "+sum);
	}
}
