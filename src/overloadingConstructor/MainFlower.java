package overloadingConstructor;

public class MainFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flowerInfo1 = new Flower();
		flowerInfo1.DisplayFlowerInfo();
		
		Flower flowerInfo2 = new Flower("Rose","Bangladesh");
		flowerInfo2.DisplayFlowerInfo();
		
		Flower flowerInfo3 = new Flower("Jasmin","India",200);
		flowerInfo3.DisplayFlowerInfo();

	}

}
