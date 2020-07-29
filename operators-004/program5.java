/* Program 5:Write a Java code containing all the operators taught (Arithmetic, Logical,
Bitwise). Code must contain 3 Classes and one Main Class, where each class should
contain at least 1 static and 1 non static methods. No operations should be
performed in main class Except Object Creation and Calling the methods.  */

class Arithmatic {
	
	int a=20,b=15;
	void addition(){
		System.out.println("addition is :"+ (a+b));
	}

	void mul(){
		System.out.println("Multiplication is :"+ a*b);
	}
}

class Logical {

	int m=12,n=15;
	boolean ans = true;
	
	void showLogic() {

	
		ans = (++m != n--) && (m-- > n++);

		System.out.println(ans);
	}
}

class Bitwise {

	int x=11,y=22;
	int result = 0;

	void displayResult() {

	result = x & y;
	System.out.println("result :"+result);
	}

	void negation(){
		result = ~(x & y);
		System.out.println("negation is :"+result);
	}

}

class operators {

	public static void main(String[] args){
		
		Arithmatic op = new Arithmatic();
		op.addition();
		op.mul();

		Logical op1 = new Logical();
		op1.showLogic();

	
		Bitwise op2 = new Bitwise();
		op2.displayResult();
		op2.negation();
	}


}
