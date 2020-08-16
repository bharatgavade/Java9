/*
Program 17: Write a program to check whether the number is prime number or not (Take hardcoded Value)
        Input: 13
        Output: It is a prime number
*/
class Pro16{
        public static void main(String args[]){
        
        int num = 13, i =2;
        boolean prime = true;
                while(i<num/2){
                        
                        if(num % i!=0){
                                prime =false;
                                break;
                        }                                
                     num++;
                }
                if(prime)
                        System.out.println("It is NOT a prime number");
                else
                        System.out.println("It is a prime number");     
        }
}
