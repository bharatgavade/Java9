import java.util.*;

class Divide{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array :");
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("enter the elements :");
		for(int i=0; i<size; i++){
			
			arr[i]= sc.nextInt();
		}

		int pcnt = 0,ncnt = 0, Ecnt = 0,Ocnt = 0, Zcnt = 0;
		for(int i=0; i<size; i++){
			
			if( arr[i] > 0){
				pcnt++;
			}else{
				
				ncnt++;
			}

			if(arr[i]%2 == 0)
				Ecnt++;
			else
				Ocnt++;

			if(arr[i] == 0)
				Zcnt++;
		}

		System.out.println(" Number of positive numbers are :"+pcnt);
		System.out.println(" Number of negative numbers are :"+ncnt);
		System.out.println(" Number of even numbers are :"+Ecnt);
		System.out.println(" Number of Odd numbers are :"+Ocnt);
		System.out.println(" Number of Zero numbers are :"+Zcnt);
	}
}
