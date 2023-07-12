package runTimePolymorphism;

public class MACBookPro extends MACBook {

	@Override
	public void start() {

	System.out.println("MACBookPro start");
	}
	@Override
	public void shutdown() {

		System.out.println("MACBookPro shutdown");
	
	}
	
}
