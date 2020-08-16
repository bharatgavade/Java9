/*
Program 18: Write a program to accept some number and print them in reverse order
        Input: 420
        Output: 024
*/
class Pro17{
        public static void main(String args[]){
        
        int num =103424,rev= 0;
        
                while(num!=0){
                        rev*=10;
                        rev +=num%10;
                        num/=10;        
                }
        System.out.println(rev);
        }
}
