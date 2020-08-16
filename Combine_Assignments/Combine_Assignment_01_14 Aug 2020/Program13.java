/*
Program 13: Find whether a number is a Neon number or not. Neon Number -> A neon number is a number where the sum of digits of square of the number is equal to the number e.g. 9 is a Neon number but how?
Square of 9 is 81, and sum of digits of 81 i.e. 8 + 1 is 9 again
        Input: 9
        Output: 9 is a neon number
*/
class Pro13{
        public static void main(String args[]){
        
        int num =9,rem = 0,temp = 0;
        int res = num * num,var =res;
        
                while(res!=0){
                     rem = res % 10;
                     temp += rem;
                     res/=10;
                        
                }
                if(temp == num)
                        System.out.println(num+" is a neon number");
                else
                        System.out.println(num+" is not a neon number");       
        }
}
