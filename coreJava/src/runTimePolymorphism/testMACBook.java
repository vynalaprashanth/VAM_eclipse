package runTimePolymorphism;

public class testMACBook   {

	public static void main(String[] args) {

		AppleLaptop m1= new MACBookPro();
		AppleLaptop m2= new MACBookAir();
		
		m1.start();
		m1.shutdown();
		m2.start();
		m2.shutdown();
		
	}

}
