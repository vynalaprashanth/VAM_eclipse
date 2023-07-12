package accessModifiers;

public class Private {

	private int a = 20;
	int b = 30;
	protected int c = 40;
	public int d = 50;

	public static void main(String[] args) {

		Private obj = new Private();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);

	}

}
