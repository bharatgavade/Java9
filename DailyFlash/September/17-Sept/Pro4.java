/*

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 

*/
class Pro4{
        public static void main(String [] args){
                
                for (int row =1;row<=5;row++){
                        
                        for(int col=1;col<=5;col++){
                                if(col==1  || row==5 ||  col==5 || row ==1 )
                                        System.out.print("3 ");
                                else if(col==3 && row==3)
                                        System.out.print("1 ");
                                else
                                        System.out.print("2 ");
                             
                        }System.out.println();
                }
        }
}
