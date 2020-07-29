/* to chake wheather the num is greater than or less than or equal to anather num */


class demo {
		
	public static void main(String[] args){
	
		int num1 = 20;
		int num2 = 10;
		String res = null;

		res = (num1 > num2) ? "num1 is greater than num2" : ((num1 < num2) ? "num2 is greater than num2" : "num1 is equal to num2");

		System.out.println(res);
	

	}

}
