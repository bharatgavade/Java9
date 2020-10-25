/* write code to sum the element of array 
 * ip: 2 16 1025 23
 * op : sum = 76
 */

class Prog3{
	
	public static void main(String[] args){
		
		int sum = 0;
		int[] arr = new int[] {2,16,10,25,23};

		for(int i=0; i<arr.length; i++){
			
			sum = sum + arr[i];
		}

		System.out.println("Sum : "+sum);
	}
}
