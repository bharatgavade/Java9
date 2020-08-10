/*
Write program to print addition of 1 to 10 with 10 to 1
Output : 
        1 + 10 = 11
        2 + 9 = 11
        .
        .
        .
        10 + 1 =11
*/
class Pro2{
        public static void main(String args[]){
                
                        int j=10,i=1;
                        while(j>=1 && i<=10){
                                System.out.println(i+" + "+j+" = 11");
                                i++;
                                j--;
                                
                        }
                
        }
}
