class Pune{
        static int covidActiveCases = 10000;
        int totalCases = 20000;
        static void noCorona(){
                System.out.println("Go Corona ... Corona Go... ");
        }
        public void lockdown(){
                System.out.println("\nLockdown : ");
                covidActiveCases++;
                totalCases++;
                System.out.println("Active Cases : " + covidActiveCases);
                System.out.println("Total Cases : " + totalCases);
        }
        public void noLockdown(){
                System.out.println("\nNo Lockdown : ");
                covidActiveCases++;
                totalCases++;
                System.out.println("Active Cases : " + covidActiveCases);
                System.out.println("Total Cases : " + totalCases);
        }
}
class Mumbai{
        static int covidActiveCases = 50000;
        int totalCases = 90000;
        static void noCorona(){
                System.out.println("Go COrona... Corona Go...");
        }
        public void lockdown(){
                System.out.println("\nLockdown : ");
                covidActiveCases++;
                totalCases++;
                System.out.println("Active Cases : " + covidActiveCases);
                System.out.println("Total Cases : " + totalCases);
        }
        public void noLockdown(){
                System.out.println("\nNo Lockdown : ");
                covidActiveCases++;
                totalCases++;
                System.out.println("Active Cases : " + covidActiveCases);
                System.out.println("Total Cases : " + totalCases);
        }
}
class Corona{
        public static void main(String[] args){
                System.out.println("\n----PUNE-----");
                Pune p1 = new Pune();
                p1.noCorona();
                p1.lockdown();
                p1.noLockdown();
                Pune p2 = new Pune();
                p2.lockdown();
                p2.noLockdown();
                
                System.out.println("\n-----MUMBAI-----");
                Mumbai m1 = new Mumbai();
                m1.noCorona();
                m1.lockdown();
                m1.noLockdown();
                Mumbai m2 = new Mumbai();
                m2.lockdown();
                m2.noLockdown();
        }
}
