/*
ask user to enter age,sex(M or F), marital status (Y or N) and then using following rules print place of service. if employee is female , then she work only in urbon areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere if employee is male and age is in between 40 to 60 then he will work in urdan areas only and any other input of age shoud print "Error" */

import java.io.*;
class Pro3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("Enter Age : ");
		int age = Integer.parseInt(br.readLine());
		
		System.out.print("Sex(f or m) : ");
		char sex= (char)br.read();
		
		char mari= (char)br.readLine();
		System.out.print("Marital Status : ");
		
		
		if(sex=='f'){
		        System.out.print("she work only in urbon areas.");
		}else if(sex=='m' && (age>=20 && age<=40)){
		        System.out.print("he may work in anywhere.");
		}else if(sex=='m' && (age>40 && age<=60)){       
		        System.out.print("he will work in urdan areas");
		}else{
		        System.out.print("Error!!!");
		}
		

                
	}
}
