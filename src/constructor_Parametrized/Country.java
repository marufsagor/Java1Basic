package constructor_Parametrized;

public class Country {
	String divisan,upozila;
	int Population;

	public Country(String div,String up, int Ppl) {
		// TODO Auto-generated constructor stub
		divisan=div;
		upozila=up; 
		Population=Ppl;
	}


void displayDivUpArea() {
	System.out.println("Divisan Name is:"+ divisan);
	System.out.println("Upozila Namen is:"+ upozila);
	System.out.println("Total Population:"+ Population);
}
}