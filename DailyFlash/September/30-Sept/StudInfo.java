// write a prigram which accept student marks and find total marks and parcentage

class StudInfo{
	
	public static void main(String[] args){
		
		int[] marks = {42,48,45,44,45,46};

		int sum = 0;
		
		for(int i =0; i<marks.length; i++){
				
			sum = sum + marks[i];
		}

		float par = (sum*100/300);

		System.out.println("Total marks : "+sum+" and Parcentage is : "+par);
	}
}
