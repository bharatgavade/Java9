/*
Program 23: Write a Java program to take two numbers (hardcoded) and print its LCM (Least Common Multiple).
        Output: enter two numbers (Hardcoded): 10 15
        LCM is 30.
*/
class Pro22{
        public static void main(String args[]){
        
        int num1= 10 , num2= 15, lcm ;
        lcm = (num1 > num2) ? num1 : num2;

                while(num1!=0) {
                      if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                        System.out.println("LCM is " +lcm);
                        break;
                      }
                ++lcm;
                }
        
        }
}
