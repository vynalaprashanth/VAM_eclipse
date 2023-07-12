package coreJavapractice;

public class ThisKey {

	int x;
	ThisKey(){
		
		System.out.println(this);
		System.out.println(this.x);
		
	}
	public static void main(String[] args) {
		new ThisKey();
		
	}
}
