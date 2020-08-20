import java.io.*;
class Pro5{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int Physics,Chemistry,Biology,Mathematics,Computer;
		
		
                System.out.print("Physics : ");
		Physics = Integer.parseInt(br.readLine());
		
		System.out.print("Chemistry : ");
		Chemistry = Integer.parseInt(br.readLine());
		
		System.out.print("Biology : ");
		Biology = Integer.parseInt(br.readLine());
		
		System.out.print("Mathematics : ");
		Mathematics = Integer.parseInt(br.readLine());
		
		System.out.print("Computer : ");
		Computer = Integer.parseInt(br.readLine());
		
		float Percentage= (Physics+ Chemistry+ Biology+ Mathematics+ Computer)/5;
		
		if(Percentage >= 90)
		        System.out.println("Percentage >= 90% : Grade A");
		else if(Percentage >= 80)
		        System.out.println("Percentage >= 80% : Grade B");
	        else if(Percentage >= 70)
		        System.out.println("Percentage >= 70% : Grade C");
	        else if(Percentage >= 60)
		        System.out.println("Percentage >= 60% : Grade D");
		else if(Percentage >= 40)
		        System.out.println("Percentage >= 40% : Grade E");
		else if(Percentage < 40)
		        System.out.println("Percentage < 40% : Grade F");        
		
                
                
	}
}
