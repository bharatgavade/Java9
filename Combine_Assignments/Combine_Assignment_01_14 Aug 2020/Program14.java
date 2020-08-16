/*
Program 15: Write a java code to count the number of steps required for a number to reduce it to zero.(Take a hardcoded value and write the number of steps required to make it zero).
        Input - num = 8
        Output - steps required = 4
        Input - num = 123
        Output - steps required = 12.
*/
class Pro14{
        public static void main(String args[]){
        int num = 8, i=0, count=0;
                /*for( i=0;i<=num;i++){
                        if(num%2==0)
                                num /=2;
                        else
                                num-=1;                                                         
                }*/
                
                while (num != 0){
                        if(num%2==0)
                                num /=2;
                        else
                                num-=1; 
                     count++;
                }

                
        
        System.out.println(count);
        }
}
