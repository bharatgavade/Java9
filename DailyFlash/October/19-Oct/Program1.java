/* find and replace specific element from an array
 * ip: Bobby lilly arjun priti
 * find : lilly 
 * replace : rosh
 */

class Prog1{
	
	public static void main(String[] args){
		
		String s1[] = {"Bobby","lilly","arjun","priti"};

		for(int i=0; i<4; i++){
			
			if(s1[i] == "lilly")
				s1[i] = "rosh";
		}

		for(int i=0; i<4; i++){
			
			System.out.println(s1[i]);
		}
	}
}
