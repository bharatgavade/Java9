class Cricket{
    
    static int totalPlayers=11;
    int wickets;
    static void displayRemaining(){
        System.out.println(totalPlayers+" Remaining players .");
    }
    void playerout(int wickets){
        totalPlayers-=wickets;
    }
}
class Team{
	public static void main(String[] args) {
	    
	    System.out.println("----Pakistan Team---");
	    Cricket pakistan=new Cricket();
	    pakistan.playerout(7);
	    pakistan.displayRemaining();
	    
	    System.out.println("----India Team---");
	    Cricket India = new Cricket();
	    India.playerout(3);
	    India.displayRemaining();
	}
}
