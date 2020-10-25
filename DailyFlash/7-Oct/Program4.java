/* write a program to calculate avg marks of each student from given marks. number of students represent the number of rows . note that total number of test for each student varies hence calculate accordingly
 * std1 : 50 60 70 90
 * std2 : 20 40 80
 * std3 : 55 77 66 91
 */

class Prog4{
	
	public static void main(String[] args){
		
		int[][] arr = new int[3][3];

		arr[0] = new int[] {50,60,70,90};
		arr[1] = new int[] {20,40,80};
		arr[2] = new int[] {55,77,66,91};

		System.out.println("Array contains :");
		for(int i=0; i<arr.length; i++){
			
			for(int j = 0; j<arr[i].length; j++){
				
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		
		int sum0 = 0, sum1 = 0, sum2 = 0;
		int avg0 = 0, avg1 = 0, avg2 = 0;
		int cnt0 = 0, cnt1 = 0, cnt2 = 0;

		for(int i=0; i<arr.length; i++){
			
			for(int j = 0; j<arr[i].length; j++){
				
				if( i == 0){
					
					sum0 = sum0 + arr[i][j];
					cnt0++;
				}else if( i == 1){
	
					sum1 = sum1 + arr[i][j];
					cnt1++;
				}else{
					
					sum2 = sum2 + arr[i][j];
					cnt2++;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			
			for(int j = 0; j<arr[i].length; j++){
				
				if(i == 0){
					
					avg0 = sum0/cnt0;
				}else if( i == 1){
					
					avg1 = sum1/cnt1;
				}else{
					
					avg2 = sum2/cnt2;
				}
			}
		}

		System.out.println("Average of student 1 : "+avg0);
		System.out.println("Average of student 2 : "+avg1);
		System.out.println("Average of student 3 : "+avg2);
	}
}
