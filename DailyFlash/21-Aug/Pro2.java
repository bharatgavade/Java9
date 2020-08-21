/* Write a program that takes electricity unit charges as input and calculate total electricity bill according to the gevin condition:
for first 50 units Rs. 0.50/unit
for next 100 unit Rs. 0.75/unit
for next 200 unit RS. 1.20/unit
for  unit above 250 Rs. 1.50/unit
*/
import java.io.*;
class Pro2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("Enter Unit : ");
		int unit = Integer.parseInt(br.readLine());
		double amt;
		
		    if(unit >= 50){
                        amt = unit * 0.50;
                    }else if(unit >= 100){
                        amt = unit* 0.75;
                    }else if(unit >= 200){
                        amt = unit * 1.20;
                    }else{
                        amt = unit * 1.50;
                    }
		
		System.out.print("total electricity bill : "+amt);
                
	}
}
