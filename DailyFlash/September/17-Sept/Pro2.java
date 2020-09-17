/*
1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4 
      
      */
class Pro2{
        public static void main(String [] args){
                
                int n=1;
                int n2=1;
                for (int row=5;row>=1;row--){
                        
                        for(int col=1;col<=5;col++){
                                if(n>5)
                                        n = 1;
                                System.out.print(n+" ");
                                n++;
                                
                        }n2++;
                        n=n2;
                        System.out.println();
        
                }
        }
}

