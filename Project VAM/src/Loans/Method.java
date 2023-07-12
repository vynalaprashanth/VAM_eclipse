package Loans;

public class Method{
	static String username="tester";
	static String password="123";

	public Method openbrowser()
	{
		System.out.println("Browser Opened");
		return this; 
	}
	public Method url()
	{
		System.out.println("Valid url");
		return this;
		
	}
	public Method login()
	{
		System.out.println("login");
		return this;
		
	}
	public Method username() {
		System.out.println("username");
		return this;
	}
	public Method password()
	{
		System.out.println("password");
		return this;
	}
	public Method submit() {
		System.out.println("submit");
		return this;
	}
	public Method close() {
		System.out.println("logout");
		return this;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	}


