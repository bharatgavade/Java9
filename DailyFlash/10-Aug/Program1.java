/*
Write a java program to print cubes of odd numbers ranging between 1 to 50.
Output : 
        Cube of 1:1
        Cube of 3: 27
        .
        .
        .
        Cube of 49 : 117649
*/
class Pro1{
        public static void main(String args[]){
                for (int i=1;i<=50;i++){
                        if(i%2!=0){
                                System.out.println("Cube of "+i+ ": "+ i*i*i);
                        }
                }
        }
}
