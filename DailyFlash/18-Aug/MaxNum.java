// write a program to find max num among numbers

class Max {
		
	public static void main(String[] args){
		
		int n1=1,n2=4,n3=2;

		String res = n1>n2 ? " 1 is greater among 1,4,2 " : (n2 >n3 ? " 4 is greater among 1,4,2" : " 2 is greater among 1,4,2");

		System.out.println(res);	
	}
}
