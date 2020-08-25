import java.io.*;
class Pro4{
        public static void main(String [] a) throws IOException{
        
                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                
                int num = Integer.parseInt(br.readLine());
                
 
                
                int i=1,sum=0;
                while(i<=num){
                        
                        sum=sum+i;
                        i++;
                }System.out.println("Sum of number up to "+num+" : "+sum);
                System.out.println("Average of "+num+" number is : "+(float)(sum/num));
                
        }
        
}
                
