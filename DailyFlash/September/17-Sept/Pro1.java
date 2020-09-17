/*

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

*/
class Pro1{
        public static void main(String [] args){
                int a= 1;
                int b= 1;
                for (int row =1;row<=5;row++){
                        
                        for(int col=1;col<=row;col++){
                                System.out.print(a+" ");
                                a--;      
                        }
                        b++;
                        a=b;
                        System.out.println();
                        
                }
        }
}

