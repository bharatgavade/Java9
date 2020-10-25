/* write code to reverse arrayof integer
 * ip : 5 10 15 20 25
 * op : 25 20 15 10 5
 */

class Prog2{
	
	public static void main(String[] args){
		
		int[] arr = new int[] {5,10,15,20,25};

		System.out.println("Reverse array is :");
		for(int i=5-1; i>=0; i--){
			
			System.out.println(arr[i]);
		}
	}
}
