/*
Write a program using while loop to print first 10 numbers which are divisible by 32 and 7
(break the loop if any number divisible by 32 and 7 is also divisible by 6)

*/
class Pro3{
        public static void main(String args[]){
                int num=224;
                int count = 1;
                
                while(count<=10){
                        num= 224;
                        num = num*count;
                        
                        if(num%32==0 && num%7==0 && num%6==0){
                                System.out.print(num);
                                System.out.println(" Number Divisible by 6 ");
                                break;
                        }else if(num%32==0 && num%7==0){
                                System.out.println(num);
                        }
                                
                        count++;
                        //num++;
                                                                                                       
                        
                }
        }
}
