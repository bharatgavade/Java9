/* to chake wheather the triangle is acute or obtuse or right angle triangle */


class demo {
		
	public static void main(String[] args){
	
		int angle = 20;
		String res = null;

		res = (angle > 90) ? "obtuse angle" : ((angle < 90) ? "acute angle" : "right angle");

		System.out.println(res);
	

	}

}
