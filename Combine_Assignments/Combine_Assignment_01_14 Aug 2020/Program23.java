/*
Program 24: Write a Java program, take a number (Hardcoded) and print the count of its digits.
        Input: enter any number: 234
        Output: number of digits: 3
*/
class Pro23{
        public static void main(String args[]){
        
        int num= 234521,count = 0;
                while(num!=0){
                      num/=10;
                     count++;  
                } 
                System.out.println("number of digits: "+count);
        }
}
