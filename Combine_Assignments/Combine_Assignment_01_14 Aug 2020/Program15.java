/*
Program 16: Write a java code to find a self-dividing number in which all of the digits are divisible by the number. (Take a while loop from 0 - 100 and print all the self-dividing numbers).
Example: Number = 12. Here 1 and 2 divide 12
*/
class Pro15{
        public static void main(String args[]){
        
        int num ;
                for (num = 0;num<=100; num++){
                        int i = num;
                        while(i > 0) {
                                if ((i % 10 == 0) || (num % (i % 10) != 0)) {
                                        break;
                                }
                                i /= 10;
                        }
                                     if (i == 0) {
                                        System.out.print(num+" ");
                                    }    
                }
              
        }
}
