/*

1 1 1 1 1 
2 2    
3 3    
4 4    
5 5 5 5 5  

*/

class Pro3{
        public static void main(String [] args){
                int a = 1;
                for (int row =1;row<=5;row++){
                        
                        for(int col=1;col<=5;col++){
                        
                                if((row >1 &&row <5)&&( col>2)   ) 
                                        System.out.print(" ");
                                else 
                                        System.out.print(a+" ");
      
                                
                        }a++;
                        System.out.println();
                }
        }
}
