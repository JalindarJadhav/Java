package project1;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charAt
		String city = "Mumbai";
		for (int i = 0; i < city.length(); i++) {
//			System.out.println(i);
			System.out.println(city.charAt(i));
		}

		String city2 = "Nagpur";
		// 012345
		char aa = city2.charAt(3);
		System.out.println(aa);

		char bb = city2.charAt(0);
		System.out.println(bb);

		// length()
		String city3 = "Bhopal";
		int cc = city3.length();
		System.out.println(cc);

		// Reverce the String.....
		String city4 = "Nashik";
		String rev = "";
		for (int i = 0; i < city4.length(); i++) {
			rev = city4.charAt(i) + rev;
		}
		System.out.println(rev);

		String fName = "Jalindar";
		String rev2 = "";
		for (int i = 0; i < fName.length(); i++) {
			rev2 = fName.charAt(i) + rev2;
		}
		System.out.println(rev2);

		String fruits = "apple mango banana grapes papaya";
		String userInput = "Mango";

		if (fruits.contains(userInput)) {
			System.out.println("fruits Available");
		} else {
			System.out.println("fruits not available");
		}

		String userinput2 = "mango";
		if (fruits.contains(userinput2)) {
			System.out.println("fruits Available");
		} else {
			System.out.println("fruits not available");
		}

		String firstName = "Jalindar"; // vowels = "aeiou";
		int count = 0;
		for (int i = 0; i < firstName.length(); i++) {
			if (firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i'
					|| firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
				count = count + 1;
			}
			System.out.println(count);
		}

		String abc = "abcdefghijklmnopqrstuvwxyz";
		int count2 = 0;
		for (int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) == 'a' || abc.charAt(i) == 'e' || abc.charAt(i) == 'i' || abc.charAt(i) == 'o'
					|| abc.charAt(i) == 'u') {
				count2 = count2 + 1;
			}
			System.out.println(count2);
		}

		////////////// 0123456789
		String lang = "Javascript";
		String substr = lang.substring(1, 5); // end value is not included
		String substr2 = lang.substring(2);
		System.out.println(substr);
		System.out.println(substr2);

	}
}

