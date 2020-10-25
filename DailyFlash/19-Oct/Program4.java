/* find index of a specific element
 * ip : 10 35 22 7 6
 * ele : 7
 * op : 4
 */

import java.util.*;
class Prog4{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);	

		int[] arr = new int[]{10,35,22,7,6};

		int cnt = 0;
		System.out.println("Enter the element whose index want to know :");
		int ele = sc.nextInt();

		for(int i=0; i< arr.length; i++){
			
			if(arr[i] == ele)
				System.out.println("Position : "+cnt);
			cnt++;
		}
	}	
}
