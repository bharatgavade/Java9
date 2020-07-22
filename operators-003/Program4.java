class Opera{
	public static void main(String[] args) {
	    int num=10;
	    long num2=2000;
	    float num3=123.5f;
	    double num4=3002.312;
	    char ch='b';
		System.out.println(~num);
		System.out.println(~num2);
		//System.out.println(~num3);//error: bad operand type float/double for unary operator '~'*
		//System.out.println(~num4);//same error
		System.out.println(~ch);
	}
}
