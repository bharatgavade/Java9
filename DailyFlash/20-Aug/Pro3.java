import java.io.*;
class Pro4{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year ;
                System.out.print("Enter year : ");
		year = Integer.parseInt(br.readLine());
		
		boolean leap = false;

                if(year % 4 == 0)
                {
                    if( year % 100 == 0)
                    {
                       
                        if ( year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }
                    else
                        leap = true;
                }
                else
                    leap = false;

                if(leap)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
                
                
	}
}
