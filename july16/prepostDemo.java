

class PrePostDemo {

	public static void main(String[] args){
		int num=10,ans = 0;

	//	ans = ++num;
	//	ans = num++;
	//	ans = --num;
		ans = num--;
		System.out.println(ans); 	//10
		System.out.println(num);	//9
		
		ans = num++;
		System.out.println(ans);	//9
		System.out.println(num);	//10
		
		ans = --num;
		System.out.println(ans);	//9
		System.out.println(num);	//9
		
		ans = ++num;
		System.out.println(ans);	//10
		System.out.println(num);	//10
	}


}
