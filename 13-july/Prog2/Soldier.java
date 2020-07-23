class IndianArmy{
       String founded = "1 April 1895";
       String mottos = " 'Service Before Self' ";
       int soldier = 1237117;
       
       static void MinisterofDefence(){
                System.out.println("Minister of Defence = Rajnath Singh ");
       }
       void info(){
                System.out.println("Indian Army Founded = "+founded);
                System.out.println("Motto's = "+mottos);
                System.out.println("Active soldiers = "+soldier);        
       }

}

class IndianNavy{
        String founded = "5 September 1612";
        String mottos = " 'May the Lord of Water be auspicious unto us'";
        int soldier = 67228;
        
         void info(){
                System.out.println("Indian Navy Founded = "+founded);
                System.out.println("Motto's = "+mottos);
                System.out.println("Active soldiers = "+soldier);        
       }
}
class IndianAirForce{
        String founded = "8 October 1932";
        String mottos = " 'Glory that touches the sky' ";
        int soldier = 139576;
        
         void info(){
                System.out.println("Indian Air Force Founded = "+founded);
                System.out.println("Motto's = "+mottos);
                System.out.println("Active soldiers = "+soldier);               
       }

}

class IndianArmedForces{
        public static void main(String args[]){
                System.out.println("\t"); 
                IndianArmy Army = new IndianArmy();
                Army.info();
                Army.MinisterofDefence();
                
                System.out.println("\t");
                IndianNavy Navy = new IndianNavy();
                Navy.info();
                IndianArmy.MinisterofDefence();
                
                System.out.println("\t");
                IndianAirForce AirForce = new IndianAirForce();
                AirForce.info();
                IndianArmy.MinisterofDefence();
                
        }
}

