package project1;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x);

		String fName = "Jalindar";
		System.out.println(fName);

//arithmetic Operation
//+,-,*,/,%
		int a = 10;
		int b = 5;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

// functions	
// 10 pair == 50 lines
		calculater(100, 50);

		addition(3, 2);

		Addition();
		substraction();
		multiplication();
		division();

		AdditionB(15, 15);
		SubsractionB(1000, 100);
		multiplicationB(100, 10);
		division(1000, 10);

		int a111 = abc(10, 10);
		System.out.println(a111);
		int b222 = abc2(223, 123);
		System.out.println(b222);
		int c333 = abc3(50, 10);
		System.out.println(c333);
		int d444 = abc4(20, 15);
		System.out.println(d444);

	}

	public static void calculater(int s, int d) {
		System.out.println(s + d);
		System.out.println(s - d);
		System.out.println(s * d);
		System.out.println(s / d);
		System.out.println(s % d);
	}

	public static void addition(int q, int r) {
		System.out.println(q + r);
		System.out.println(q - r);
		System.out.println(q * r);
		System.out.println(q / r);
		System.out.println(q % r);

	}

//Basic functions 
//function with parameter and with return return type
	public static void Addition() {
		System.out.println(9 + 9);
	}

	public static void substraction() {
		System.out.println(5 - 2);
	}

	public static void multiplication() {
		System.out.println(1 * 10);
	}

	public static void division() {
		System.out.println(30 / 2);
	}

//function parameter with return type
	public static void AdditionB(int g, int h) {
		System.out.println(g + h);

	}

	public static void SubsractionB(int n, int m) {
		System.out.println(n - m);
	}

	public static void multiplicationB(int y, int z) {
		System.out.println(y * z);
	}

	public static void division(int u, int v) {
		System.out.println(u / v);
	}

//function with parameter and with return type
	public static int abc(int j, int k) {
		return j + k;
	}

	public static int abc2(int f, int d) {
		return f - d;
	}

	public static int abc3(int b, int c) {
		return b * c;

	}

	public static int abc4(int e, int w) {
		return e / w;
	}

}

