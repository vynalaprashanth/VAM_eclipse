package polymorphism;

public class compileTime {

	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is 1 : " + result);
	}

	void add(float a, float b) {

		float result = a + b;
		System.out.println("Result is 2 : " + result);
	}

	

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Result is 3 : " + result);
	}

	public static void main(String[] args) {

		compileTime c = new compileTime();
		c.add(10, 34);
		c.add(984f, 123f);
		c.add(3345, 92722, 8825);
    
	}
}
