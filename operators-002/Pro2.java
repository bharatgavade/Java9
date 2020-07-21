class Rel2{
        public static void main(String[] args){
                int num = 20;
                
                System.out.println("num>>>= 2 : " + (num>>>= 2));               
                System.out.println("num<<= 3 : " + (num<<= 3));
                System.out.println("num ^= 2 : " + (num ^= 2));
                System.out.println("num = ++num : " + (num = ++num));
                System.out.println("num = ~num : " + (num = ~num));
        }
}
