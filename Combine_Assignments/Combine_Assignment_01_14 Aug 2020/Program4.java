/*
Program 4: Write a program to find second largest number from the given 3 numbers.
Take following set of inputs:-

A] int a = 10, b = 20, c = 30; <- second largest number is 20
B] int a = 23334, b = 1010, c = 10000 by<- second largest number is 10000
C] int a = 1999, b = 2000, c = 1998 <- second largest number is 1999
Optional: If you know the concept of array in java then solve following test
cases using array.
A] 455 800 56 39 290 18 383 3 290 29 10
B] 10 9 4 5 6 7 8 3
C] 10 8 56 23 45 97

*/
import java.util.Arrays;

class Pro4{
        public static void main(String args[]){
        int A[] = {43,300,16,79,90,12,781,33,290,49,17};
        int total = 11;
        Arrays.sort(A);  
        
        System.out.println("Second Largest: "+A[total-2]);  

        
        }
}
        
        
