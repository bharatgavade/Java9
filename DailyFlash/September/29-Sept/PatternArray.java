class Pattern{
	
	public static void main(String[] args){
		
		char[] arr = {'A','B','C','D','E'};	

		for(int i=0; i<5; i++){
			char ch = arr[i];
			for(int j=4;j>=i; j--){
				
				System.out.print(" "+ch);
				ch++;
			}
			System.out.println();
		}
	}	
}
