package flowControl;

public class IfelseBlock {

	public static void main(String[] args) {

		int maths=50;
		int physics=93;
		int chemistry=66;
		
		
		int average=(maths+physics+chemistry)/3;
		if((maths<35)&&(physics<35)&&(chemistry<35)) {
			
			System.out.println("FAIl");
			
		}
		else if(average<=59){
			
			System.out.println("C");
		}else if(average<=69) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		
		
	}

}
