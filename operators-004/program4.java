/*Program 4: Solve the Following Expressions and Write explanation of each operation
along with the order of precedence
1]. int a = 25, b = -34, c = 19, d = 4;
2]. int res = ((a << 2 | b >> 3)
3]. boolean result = ((a << 2 | b >> 3) < -10 ) || ((c++ << 2 & b-- >>> d) >= 23)  */

class demo {

	public static void main(String[] args){

		int a=25,b=-34,c=19,d=4;

		boolean ans=true;

		//ans = (a<<2 | b>>3);
		ans = ((a<<2 | b>>3) < -10) || (( c++ << 2 & b-- ) >= 23);
		System.out.println(ans);
	}

}
