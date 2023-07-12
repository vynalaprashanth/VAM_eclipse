package dataTypes;

public class BMIcalculator {

	public static void main(String[] args) {

		double height = 5.64;
		double weight = 60;
		double heightInMeters = height * 1.719072;

		double BMI = weight / (heightInMeters * heightInMeters);
		System.out.println("BMI:" + BMI);

	}

}
