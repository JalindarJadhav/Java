package project1;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am ";
		String str2 = "learning";
		String str3 = "Javasript";

		// join()
		String joinn = String.join("@", str);
		System.out.println(joinn);

		String joinn2 = String.join("@", str, str2, str3);
		System.out.println(joinn2);

		// indexOf()
		////////////// 0123
		String city = "Pune";
		int result = city.indexOf("u");
		System.out.println(result);

		int result2 = city.indexOf("n");
		System.out.println(result2);

		// 01234567
		// Jalindar
		String fuName = "Jalindar";
		int a = fuName.indexOf("a", 3);
		System.out.println(a);

		for (int i = 0; i < fuName.length(); i++) {
			System.out.println(i);
//			System.out.println(fuName.charAt(i));
		}

		// trim()
		String Bro = "  Amol ";
		System.out.println(Bro.length());
		String b = Bro.trim();
		System.out.println(b);
		System.out.println(b.length());

		// replace()
		String city11 = "Nashik";
		String c = city11.replace("N", "A");
		System.out.println(c);

//		isEmpty()
		String str11 = "";
		String str22 = "Janardhan";
		Boolean as = str11.isEmpty();
		Boolean df = str22.isEmpty();
		System.out.println(as);
		System.out.println(df);

	}

}
