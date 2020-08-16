/*
Program 20: Write a Program in Java, Print the following pattern using for loop.
                        A B C D
                        a b c d
                        E F G H
                        e f g h
*/
class Pro19{
        public static void main(String args[]){
        int n=65 , n2 = 97;
        for(int i=1 ; i<5 ;i++){
                for(int j= 1;j<5;j++){
                        if(i%2!=0){
                                System.out.print((char)n+" ");
                                n++;
                        }else{
                                System.out.print((char)n2+" ");
                                n2++;
                         }
                } 
                System.out.println("");
        }
        
        }
}
