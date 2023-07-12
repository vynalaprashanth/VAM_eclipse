package runTimePolymorphism;

public class MACBookAir extends MACBook {

	
	@Override
	public void start() {

	System.out.println("MACBookAir start");
	}
	
	@Override
	public void shutdown() {

	
	System.out.println("MACBookAir shutdown");
	}
}
