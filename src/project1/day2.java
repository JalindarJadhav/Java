package project1;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tagName = "I am learning selinium";
		System.out.println(tagName);

		// String + Integer =====> String
		// Integer + String =====> String
		// String + String =====> String
		// Integer + Integer ====> Integer

		// program 1
		System.out.println("Jalindar" + 781);
		System.out.println(781 + "Jalu");
		System.out.println("Jalindar" + "Jadhav");
		System.out.println(500 + 500);

		// program 2
		String firstName = "Jalindar";
		int fl = firstName.length();
		System.out.println(fl);

		// program 3
		// concat
		String firstNameB = "Jalindar";
		String lastName = "Jadhav";

		String fullName = firstName.concat(lastName);
		System.out.println(fullName);

		System.out.println(firstNameB + lastName);

		// program 4
		String city = new String("Sinnar");
		System.out.println(city);

		// program 5
		String city2 = "nagpur";
		String a1 = city2.toUpperCase();
		System.out.println(a1);

		// program 6
		String city3 = "PUNE";
		String b1 = city3.toLowerCase();
		System.out.println(b1);

		// program 7
		String city4 = "Kopargoan";
		String city5 = "Kopargoan";
		String city6 = "Sangamner";

		// equals
		System.out.println(city4.equals(city5));
		System.out.println(city5.equals(city6));

		if (city4.equals(city5)) {
			System.out.println("Equal city");
		} else {
			System.out.println("Diffrent city");
		}
		// ans is Equal city

		if (city5.equalsIgnoreCase(city6)) {
			System.out.println("Same city");
		} else {
			System.out.println("Diffrent city");
		}

		// ternary operator
		String c1 = city4.equals(city5) ? "equals" : "Not equals";
		System.out.println(c1);

		String d1 = city4.equals(city6) ? "equals" : "Not equals";
		System.out.println(d1);

		// program 8
		// startsWith
 
		String city7="Nashik";
		Boolean a11=city7.startsWith("na");
		Boolean a22=city7.startsWith("Na");
	
		System.out.println(a11);
		System.out.println(a22);
		
		//endsWith
		String city8="Sinnar";
		Boolean a33=city8.endsWith("aar");
		Boolean a44=city8.endsWith("nnar");
				
		
		
		System.out.println(a33);
		System.out.println(a44);
		
		
		
		String headOne="I am learning Java";
		Boolean b11=headOne.contains("Java");
		System.out.println(b11);
		
		Boolean b22=headOne.contains("Jalindar");
		System.out.println(b22);
	
	}
}
