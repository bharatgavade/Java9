/*
Program 10: Write a java program to calculate the power of a given number.
        Input: number 10, power: 2
        Output: 10 to the power 2 is 100
*/
class Pro10{
        public static void main(String a[]){
        int num=10, pow = 2, res= 1;
        int p = pow;
        while(pow !=0){
             res*=num;
             pow--;   
        }
        System.out.println(num+" to the power "+p+" is "+res);
        }
 }
