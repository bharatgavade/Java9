import java.io.*;
class Limit{
	
	public static void main(String[] arsg) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Upper limit :");
		int upLimit = Integer.parseInt(br.readLine());

		System.out.println("Enter the lower limit :");
		int lwLimit = Integer.parseInt(br.readLine());
	
		int cnt = 1;

		System.out.println("The numbers are :");
		for(int i= upLimit; i<=lwLimit; i++){
			
			if(i%2 == 0){
				
				System.out.println(cnt+" : "+(i*i));
				cnt++;
			} else {
				
				System.out.println(cnt+" : "+(i*i*i));
				cnt++;
			}
		}
	}
}
