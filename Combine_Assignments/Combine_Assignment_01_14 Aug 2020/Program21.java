/*
Program 22: Write a program to check whether given hardcoded char is a vowel or a consonant.
Follow the outline.
1. Take a String to only store if vowel, then sVar: “Vowel”
2. Otherwise sVar: “Consonant”
3. Use the switch statement to print whether it is a vowel or consonant using input to switch as sVar.
*/

class Pro21 {
	
	public static void main(String[] args){
		
		int sVar = 2;
		System.out.println("Enter the String :");
		System.out.println(" 1 : Vowel");
		System.out.println(" 2 : Consonant");

		switch(sVar){
			
			case 1 :
				System.out.print("\n");
				System.out.println("Choice 1");
				String str = "Vowel";
				for(int i=0; i<str.length(); i++){
					
					char ch = str.charAt(i);
					if(ch==65 || ch==97 || ch==101 || ch==69 || ch==105 || ch==73 || ch==111 || ch==79 || ch==117 || ch==85 )
						System.out.println(" "+ch+" is a vowel");
					else
						System.out.println(" "+ch+" is a consonant");
				}
				break;
		
	
			case 2 :
				System.out.print("\n");
				System.out.println("Choice 2");
				 str = "Consonant";
				for(int i=0; i<str.length(); i++){
					
					char ch = str.charAt(i);
					if(ch==65 || ch==97 || ch==101 || ch==69 || ch==105 || ch==73 || ch==111 || ch==79 || ch==117 || ch==85 )
						System.out.println(" "+ch+" is a vowel");
					else
						System.out.println(" "+ch+" is a consonant");
				}
				break;
		}
	}
}
