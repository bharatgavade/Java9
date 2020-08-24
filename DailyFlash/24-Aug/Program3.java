/*Write a program to print 1st 50 odd numbers.
        output:
                1 3 5 ... 99
                */

class Pro3{
        public static void main(String [] args){
                int i;
                
                 for(i=1;i<=2*50;i++){
                         if(i%2 == 0)
                                continue;
                         else
                                System.out.print(i+" ");
                 }  
        
        }

}
