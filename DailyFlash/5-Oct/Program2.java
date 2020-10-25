/* write a program that accepts 2D array  and print only the addition of even elements multiplied by max odd element from that array
 * eg : 1 2 3
 * 	3 4 5
 * 	5 6 7
 *
 * 	sum of even no = 12
 * 	max odd no = 7
 * 	ans = 12 * 7 : 84
 */

class Add{
	
	public static void main(String[] args){
	
		int arr[][] = {{1,2,3},{3,4,5},{5,6,7}};

		int sum = 0, max = 0;

		for(int i=0; i<3; i++){
			
			for(int j=0; j<3; j++){
				
				if(arr[i][j] %2 == 0){
					
					sum = sum + arr[i][j];
				}else{
					
					if(arr[i][j] > max)
						max = arr[i][j];
				}
			}
		}

		System.out.println("Sum of even elements : "+sum);
		System.out.println(" Max odd Element : "+max);
		System.out.println(" Expected output : "+(sum*max));
	}
}
