/*Write a program to print sum of  1st 10 Natural numbers.
        output:
                The sum of First 10 Natural Numbers : 55
                */
class Pro2{
        public static void main(String [] args){
                int i=1;
                int sum =0;
                while(i<=10){
                        
                        sum= sum+i;
                        i++;
                }System.out.println("The sum of First 10 Natural Numbers : "+sum);
        
        }

}
