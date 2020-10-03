//convert upper case into lowercase
class LowerCase{
	
	public static void main(String[] args){
		
		char[] arr = {'A','B','C','D','E'};

		//int x = (int)arr[i];
		for(int i=0; i<5; i++){
			
				int x = (int)arr[i];
				x = x + 32;
				System.out.println(" "+(char)x);

		}
	}
}
