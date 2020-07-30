/* Write a program to toggle a single character i.e. if a letter is in upper case covert it in lower case 
        and if a letter is lower case conver it into upper case 
        INPUT : A
        OUTPUT : a  */
class IFelse{
        public static void main(String args[]){
                
                String chr="A";
                /*char chr='A';
                if(Character.isUpperCase(chr)){
                        System.out.println(Character.toLowerCase(chr));
                }else{
                        System.out.println(Character.toLowerCase(chr));
                } */
                
                int ch=chr.charAt(0);
                if(ch>64&&ch<91){
                        ch=ch+32;
                        System.out.print((char) ch);
                }else if(ch>96&&ch<123){
                        ch=ch-32;
                        System.out.print((char) ch);
                }           
        }
}
