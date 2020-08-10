/*
write a java program to print table of 4 in reverse order using while loop
        Output : 
                Table of 4 in reverse order :40 36 32 28 . . . 4
                
*/
class Pro5{
        public static void main(String args[]){
                int i = 40 ;
                while(i>=4 ){
                        if(i%4==0){
                                System.out.print(i+" ");
                      }
                      i--;  
                }
        }
}

