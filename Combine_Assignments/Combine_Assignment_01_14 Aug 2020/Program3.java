/*
Program 3: Write a Program that prints occurrences of a digit from a number, Take input hardcoded Number: 345669760562. Digit to check Frequency: 6
        Output: The occurrence of 6 in number 34566970562 is 4.
*/
class Pro3{
        public static void main(String args[]){
               long digit = 566697662;
               long D = 6 ,count =0; // D is number of check Frequency, count is counting of number Frequency
               
               while(digit > 0){
                        if(digit % 10 == D)
                                count++;
                        digit = digit / 10;
               }
               System.out.println(count);         
                        
                        
        }
 }       
