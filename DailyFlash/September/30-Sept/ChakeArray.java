// write a program which chakes if certain value is present in array or not

class Chake{
	
	public static void main(String[] args){
		
		int[] my_arr1 = {1789,2035,1899,2013,1458,2458,1254,1472,2356};

		for(int i=0; i<my_arr1.length; i++){
			
			if(my_arr1[i] == 2013 || my_arr1[i] == 2015){
				
				System.out.println("YES");
				System.out.println(" "+my_arr1[i]+" is prsent");
			}
		}
	}
}
