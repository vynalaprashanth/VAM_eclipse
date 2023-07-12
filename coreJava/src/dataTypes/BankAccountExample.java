package dataTypes;

public class BankAccountExample {

	
	static String bankname=("ICICI Bank");
	String Bankname="HDFC";
	static String Name;
	static int AccNo;
	float balance;
	
	
	public static void main(String[] args) {

		BankAccountExample ba=new BankAccountExample();
		ba.Name="Prashanth";
		ba.AccNo=1099243576;
		ba.balance=25000;
		System.out.println(bankname);
		System.out.println(ba.balance);
		System.out.println(bankname.contains("I"));

		
		
	}

}
