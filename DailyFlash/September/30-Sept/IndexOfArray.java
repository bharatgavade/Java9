// write a program which find the index of certain element

class Index{
	
	public static void main(String[] args){
		
		int[] my_arr1 = {25,14,56,15,36,56,77,18,29,49};

		int cnt = 0;
		for(int i=0; i<my_arr1.length; i++){
			
			if(my_arr1[i] == 25 || my_arr1[i] == 77){
				
				System.out.println(" "+my_arr1[i]+" is present at index position "+i);
			}
		}
	}
}
