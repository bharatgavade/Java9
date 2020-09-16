/*

A B C D 
  A B C 
    A B 
      A 
      
      */
class Pro2{
        public static void main(String [] args){
                
                for (int row =4;row>=1;row--){
                        char ch ='A';
                        for(int col=4;col>=1;col--){
                                if(row>=col){
                                        System.out.print(ch+" ");
                                        ch++;
                                }else{
                                        System.out.print("  ");
                                }
                        }System.out.println();
                }
        }
}

