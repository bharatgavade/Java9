/*
Program 9: Write a java program to check if the taken number is palindrome or not.
        Input: 121 (Take Hardcoded)
        Output: 121 is a palindrome number
*/
class Pro9{
        public static void main(String a[]){
        
        int num = 20202, sum = 0, rem ,temp =num ;
        
                while(num>0){
                        rem = num%10;
                        sum = (sum *10) +rem;
                        num/=10;
                }
                if (temp == sum)
                        System.out.println(temp+ " is a palindrome number");
                else
                        System.out.println(temp+ " is NOT a palindrome number");
      }
 }
