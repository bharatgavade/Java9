/*
Write a java program to take 100 value from user and print the reverse order of that particular number and also check which number is divisible by 5
Input:
        Enter the value : 100
OUTPUT :
        Reverse Order : 100,99,98.....,2,1,0
        Divisible By 5 : 100,95,90,....,5
*/
class Pro4{
        public static void main(String a[]){
        
        System.out.println("Reversed Order :");
        for(int i=100;i>=1;i--){
                
                System.out.print(i+",");
        }
        System.out.println("\nDivisible By 5 :");
        for(int i=100;i>=1;i--){
                
                if(i%5==0){
                        System.out.print(i+",");
                }
        }                   
   }
}
