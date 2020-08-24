/*Write a program to print 1st 50 Even numbers.
        output:
                2 4 6 ... 100
                */

class Pro4{
        public static void main(String [] args){
                int i;
                
                 for(i=1;i<=2*50;i++){
                         if(i%2 != 0)
                                continue;
                         else
                                System.out.print(i+" ");
                 }  
        
        }

}
