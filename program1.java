class Dominos {

	int price;
	int quantity;
	static int total;

	static void bill() {
		
		System.out.println("Total bill is :"+total);
	}
	
	public static void main(String[] args){

	Dominos pizza = new Dominos();
	pizza.quantity = 4;
	pizza.price =250;

	total = (pizza.quantity)*(pizza.price);
	
	Dominos.bill();

	Dominos Fries = new Dominos();
	Fries.quantity = 3;
	Fries.price = 90;
	
	total = (Fries.quantity)*(Fries.price);
	Dominos.bill();

	}

}
