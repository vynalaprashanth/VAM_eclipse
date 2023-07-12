package accessModifiers;

public class Protected extends Private {

	public static void main(String[] args) {

		Private pv= new Private();
		System.out.println(pv.d);
		
		Protected pc= new Protected();
		System.out.println(pc.b);
		
		
		
	}

}
