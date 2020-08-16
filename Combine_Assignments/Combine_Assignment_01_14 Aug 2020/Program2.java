/*
Program 2: Write a code in Java, to find Greatest Common Divisor (GCD) of two given numbers.
*/

class Pro2{
        public static void main(String args[]){
        
          int num1 = 30, num2 = 250;  

        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }

        System.out.println("GCD is : "+num2);
    }

}

