class demo {

	boolean isEligible(int x){
		
		String attendance = null;

		attendance = (x > 75) ? "the student is eligible for the exam" : "the student is not eligible for the exam";
		
		System.out.println(attendance);	
		return true;
	}

	public static void main(String[] args){

		demo obj = new demo();
		obj.isEligible(65);
	}
}
