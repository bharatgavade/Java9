import java.util.*;

class Pattern{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("enter number of rows :");
		int row = sc.nextInt();

		for(int i = row; i>=1; i--){
			
			for(int j=1; j<=5; j++){
			
				if((i + j)%2 == 0)	
					System.out.print(" 0");
				else
					System.out.print(" 1");
			}
			System.out.println();
		}
		
	}
}
