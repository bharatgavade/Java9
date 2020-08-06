/*
Write a java program to print the table of 3 and also check which numbers are even in that table.

*/
class Pro5{
        public static void main(String a[]){
        int i ;
        System.out.print("Table of 3 :");
        for(i=1;i<=30;i++){
                
                if(i%3==0){
                        System.out.print(i+",");
                        
                }
        }
        System.out.print("\nEven Number present in table :");
        for(i=1;i<=30;i++){
                
                if(i%3==0){
                        //System.out.print(i+",");
                        if(i%2 ==0){
                                System.out.print(i+",");
                        }
                }
        }                   
   }
}
