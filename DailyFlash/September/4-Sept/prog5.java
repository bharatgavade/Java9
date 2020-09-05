// check Date exists or not
import java.io.*;

class Prog5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int date, mon, year;
		String[] d = br.readLine().split("/");

		date = Integer.parseInt(d[0]);
		mon = Integer.parseInt(d[1]);
		year = Integer.parseInt(d[2]);

		switch(mon) {
	
		case 1:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 2:
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				if(date <= 29)
					System.out.print("Date exists\n");
				else
					System.out.print("Date doesnt exists\n");
			}
			else {
				if(date <= 28)
					System.out.print("Date exists\n");
				else
					System.out.print("Date doesnt exists\n");
			}
			break;
		case 3:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 4:
			if(date <= 30)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 5:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 6:
			if(date <= 30)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 7:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 8:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 9:
			if(date <= 30)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 10:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 11:
			if(date <= 30)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		case 12:
			if(date <= 31)
				System.out.print("Date exists\n");
			else
				System.out.print("Date doesnt exists\n");
			break;
		default:
			System.out.print("Date doesnt exists\n");
			break;
	}
	}
}
