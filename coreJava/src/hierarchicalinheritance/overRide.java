package hierarchicalinheritance;

public class overRide {
public static void main(String[] args) {

		Bike b= new Bike();
		System.out.println(b.fuel());
		Car c=new Car();
		System.out.println(c.fuel());
		Bus bu=new Bus();

		System.out.println(bu.fuel());
		

		
	}

}
