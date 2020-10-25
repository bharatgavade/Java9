/* write a java program to reverse a value in array
 * ip : 12 34 56 78 90 01
 * op : 01 90 78 56 34 12
 *
 */

class Reverse{
	
	public static void main(String[] args){
		
		int[] arr = {12,34,56,78,90,01};
		
		System.out.println(" Normal array is :");
		for(int i=0; i<=5; i++){
			
			System.out.println(" "+arr[i]);
		}

		System.out.println("Reverse array is :");
		for(int i=5;i>=0; i--){
			
			System.out.println(" "+arr[i]);
		}
	}
}
