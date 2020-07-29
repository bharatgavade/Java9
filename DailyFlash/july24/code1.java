class demo {

	int evenOdd(int x){

	if(x%2 == 0)
		System.out.println("x is even"+x);
	else 
		System.out.println("x is odd"+x);
	return 0;
	}
	public static void main(String[] args){
		demo obj = new demo();
		obj.evenOdd(20);

		
	}


}
