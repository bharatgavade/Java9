/*
Program 6: write a program to check whether the number is perfect number or not
Hint: (positive integer that is equal to the sum of its proper divisors)
        e.g i/p : take hardcoded value
        o/p : 6 is a prefect number
*/

class Pro6{
        public static void main(String a[]){
        
        int num =6 ,sum =0;
        for (int i =1 ;i< num;i++){
                if(num % i==0){
                        sum+=i;
                }
        }if(sum == num){
                System.out.println(num+" is a perfect number.");
         }else{
                System.out.println(num+" is not a perfect number.");
         }
        
        }
}

