/*Write a program to find greatest number among three numbers using if-else ladder.
        INPUT : num1 =40
                num2 = 70
                num3 = 30
        OUTPUT :
                Largest number is 70   */

class IFelse2{
        public static void main(String args[]){
        
        int num1=40,num2=70,num3=30;
        
        if(num1 > num2 && num1 > num3){
            System.out.println("Largest number is:"+num1);
        }else if(num2 > num3){
            System.out.println("Largest number is:"+num2);
        }else{
            System.out.println("Largest number is:"+num3);
        }
       }
 }
