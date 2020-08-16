/*
Program 8: Write a Program that takes a number as input from and prints only those digits from that number, which are prime.
        I/p:141 (Take a hard coded value)
        O/p: the prime digit from the number 141 is 1
*/
class Pro8{
        public static void main(String a[]){
         int num = 23456891, count = 0,digit = 0;
        System.out.println("The prime digit from the number "+num+" is ");
                while(num !=0){
                
                digit = num% 10;
                num = num/10;
                        if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
                                
                        }else{
                                System.out.print(digit+",");
                        }
                 count++;
                }
                //System.out.println(digit+",");        
         
         }
         
}
