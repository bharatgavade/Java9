/*
Program 19: Write a Program in Java, Print the following pattern using for loop.
                        A B C D
                        E F G H
                        I J K L
                        M N O P
*/
class Pro18{
        public static void main(String args[]){
        int n=65;
        for(int i=1 ; i<5 ;i++){
                for(int j= 1;j<5;j++){
                        System.out.print((char)n+" ");
                        n++;
                } 
                System.out.println("");
        }
        
        }
}
