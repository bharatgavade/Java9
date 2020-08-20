
class Program {

	public static void main(String[] args) {
	
		int num = 1;
		for(int i = 1; i <= 16; i++) {
		
			System.out.print(num + " ");
			num++;
			if(i % 4 == 0) {
				num = 1;
				System.out.println();
			}
		}
	}
}
