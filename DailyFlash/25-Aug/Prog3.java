import java.io.*;
class Pro3{
        public static void main(String [] a) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        if(num%2==0)
                System.out.println(num+" is Even");
        else
                System.out.println(num+" is Odd");       
      }
}  
