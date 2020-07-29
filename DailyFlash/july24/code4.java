/* to chake wheather the character is consonent or vowel */


class demo {
		
	public static void main(String[] args){
	
	char ch = 'A';
	String res = null;

	res = (ch == 65 || ch == 97 || ch == 101 || ch == 69 || ch == 105 || ch == 73 || ch == 111 || ch == 79 || ch == 117 || ch == 85 ) ? "it is a vowel" : " it is a consonent";

		System.out.println(res);
	

	}

}
