/*Program 3: Write a Java program for following operations and explain the error if any.
1.num=188 result = num>>>4
2.num=255 result1 = num<<<3
2. num = -108 result =num>>>23
3. num=-123 result1 = num<<<15   */

class demo {

	public static void main(String[] args){

		int ans = 0;
		ans = 188 >>> 4;
		System.out.println(ans);
		
		int ans = 0;
		ans = 255 <<< 3; 		//for shift operators there is no need for <<< because << shift does the job
		System.out.println(ans);
		
		int ans = 0;
		ans = -108 >>> 23;
		System.out.println(ans);
		
		int ans = 0;
		ans = -123 <<< 15;		// << shift does the job
		System.out.println(ans);

	}

}
