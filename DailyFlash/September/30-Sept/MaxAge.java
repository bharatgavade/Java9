import java.util.*;

class Max{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("enter the elements :");
		for(int i=0; i<size; i++){
			
			arr[i]= sc.nextInt();
		}

		int max = 0;
		int index = 0;
		for(int i=0; i<size; i++){
	
			if( arr[i] > max)
				max = arr[i];	
		}
		
		for(int i=0; i<size; i++){
			
			if(max == arr[i])
				index = i;
		}
		System.out.println(" Max age is : "+max+" is at index position : "+index);
	
}
}
