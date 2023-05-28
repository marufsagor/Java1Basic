package overloadingConstructor;

public class Flower {
	String flowerName;String flowerCountry;
	int flowerPrice; {
		// TODO Auto-generated constructor stub
	}
	Flower(){
		System.out.println("This is Default Constror");
	
	}
	Flower(String n,String C){
		System.out.println("This is two paraemeter pass constructor");
		flowerName= n;
		flowerCountry=C;
		
	}
	Flower(String n,String C, int p){
		System.out.println("This is three parameter pass constructor");
		flowerName= n;
		flowerCountry=C;
		flowerPrice=p;	
	}
	
	
	void DisplayFlowerInfo() {
		System.out.println("Flower Name is :"+flowerName);
		System.out.println("Flower Country is:"+flowerCountry);
		System.out.println("Flower Price:"+flowerPrice);
		
	}
	

}
