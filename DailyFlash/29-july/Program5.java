/* write a code in java to check whether a number is odd or even using bitwise operator and not using atithmetic operator .
        **Code Format**
        * write a static method isEven:
        * integer parameter : number
        * return type Integer.
        * in main :
                Take a hardcoded number and inside an if statement call the isEeven() method.
                if the method is returing a zero then print Even else print Odd.
        INPUT :100
        OUTPUT : Even
*/
class Program5{
        static int isEven(int number){
                if (((number <<2)>>2)== number){        //shiffing left by 2 and after right shftting by 2
                    return 1; 
                }else{
                    return 0;
                }
        }
        public static void main(String args[]){
        
        int number = 100;
        if(isEven(number)== 1){
                System.out.println("Even");
        }else{
                System.out.println("Odd");
        }
        
        }
}

        
