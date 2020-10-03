/*  take no. of overs from user calculate total no. of balls by the value of total overs and create an array of run of size of calculated number of total balls i.e(if overs are 2 then take array size is 12 ) take runs from user then print the foolowing :
 *  1 total score
 *  2 total number of balls
 *  3 total no. of sixes i.e(6)
 *  4 total no. of fours 4
 *  5 total no. of others i.e(1 2 3)
 */

import java.io.*;

class Cricket{
	
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number of overs :");
		int over = Integer.parseInt(br.readLine());

		int size = over*6;

		int[] runs = new int[size];

		System.out.println("Enter the runs :");
		for(int i=0; i<size; i++){
			
			runs[i]=Integer.parseInt(br.readLine());
		}

		int Scnt = 0;
		int Fcnt = 0;
		int Ocnt = 0;
		int sum = 0;

		for(int i=0; i<size; i++){
			
			sum = sum + runs[i];

			if(runs[i] == 6)
				Scnt++;
			else if(runs[i] == 4)
				Fcnt++;
			     else 
				 Ocnt++;
		}

		System.out.println(" 1 . Total score : "+sum);
		System.out.println(" 2 . Total number of balls : "+size);
		System.out.println(" 3 . Total number of sixes : "+Scnt);
		System.out.println(" 4 . Total number of fours : "+Fcnt);
		System.out.println(" 5 . Total number of others : "+Ocnt);
		
	}
}
