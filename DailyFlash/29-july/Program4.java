/* Write a code in java to check divisiblity of a number by 2 using bitwise operators.
        *Note: Don't use arithmetic operators to check divisiblity.
        *write a static function isDivisible:
                integer parametrs: dividend and divisor 
                Return type : boolean
        *in main method :
        take two integer variables divided and divisor(Note :divisor should be 2 as we are checking divisblity by 2)
        *call isDivisible method form if statement and print yes if the method returns true else print No if the method returns false
        
        INPUT :
               Dividend = 8
               Divisor = 2
        OUTPUT :
                yes   */
class Program4{
        static boolean isDivisible(int dividend,int divisor){
                return ((dividend ^ 1)== dividend+1);           // 13 ^ 1= 14(XOR operation) == 13+1 =14
        }
        
        public static void main(String[] args){
                int dividend = 13, divisor =2 ;
                if((isDivisible(dividend,divisor))){
                        System.out.println("YES");
                }else{
                        System.out.println("NO");
                }
        }
}   
        
