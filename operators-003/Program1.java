class CheckBitwise
{
	public static void main(String[] args) {
	    
	    int num1=2,num2=4;
	    float fnum1=2.5f,fnum2=3.4f;
	    char ch1='b',ch2='g';
	    long lnum1=12345,lnum2=54622;
	    double dnum1=20.3400,dnum2=15.0023;
	    
	    System.out.println(" Bitwise AND & ");
	    System.out.println(num1&num2);
	   // System.out.println(fnum1&fnum2);
	   // System.out.println(dnum1&dnum2);
	    System.out.println(ch1&ch2);
	    System.out.println(lnum1&lnum2);
	    
	    System.out.println(" Bitwise OR | ");
	    System.out.println(num1|num2);
	    //System.out.println(fnum1|fnum2);
	   // System.out.println(dnum1|dnum2);
	    System.out.println(ch1|ch2);
	    System.out.println(lnum1|lnum2);
	    
	    System.out.println(" Bitwise XOR ^ ");
	    System.out.println(num1^num2);
	    //System.out.println(fnum1^fnum2);
	    //System.out.println(dnum1^dnum2);
	    System.out.println(ch1^ch2);
	    System.out.println(lnum1^lnum2);
	    
	}
}
//error for data types float and double: bad operand types for binary operator 'opertor'(&,|,^)
