class Oper{
	public static void main(String[] args){
	    
	    int num1=10,num2=5;
	    int a,b,ab;
	    /*a=(num1++ | num2);
	    b= ((++num2)^num1);
	    ab= (num1++ | num2)&((++num2)^num1);
	    System.out.println("(num1++ | num2)"+ a);
	    System.out.println("((++num2)^num1)"+ b);*/
	    
	    System.out.println((num1++ | num2)&((++num2)^num1));
	    
	}
}
/*
(10 | 5)----->15
(6 ^ 11)----->13
(15 & 13)----->13

    */
