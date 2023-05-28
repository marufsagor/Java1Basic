package classObjectMethod_Parametrized;

public class Teacher {

	String Address,bikeName;
	int BankAcc;
	
	void setInformation(String Th,String Mo, int Acc){
	Address = Th;bikeName = Mo;BankAcc = Acc;
	}
	
	void DisplayTeacherAddBikeBank() {
		System.out.println("Address is "+ Address);
		System.out.println("Bike name is "+bikeName);
		System.out.println("Bank Acc Name is "+BankAcc);
		
	}
}
