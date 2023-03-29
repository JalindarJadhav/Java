package project1;

import java.util.Arrays;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = new int[5];
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		num[3] = 44;
		num[4] = 55;
		System.out.println(num);
		System.out.println(Arrays.toString(num));

		String aaa = Arrays.toString(num);
		System.out.println(aaa);

		for (int i = 0; i < num.length; i++) {
//	    	System.out.println(i);
			System.out.println(num[i]);
		}

		int[] num3 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < num3.length; i++) {
//			System.out.println(i);
			System.out.println(num3[i]);

		}

	}

}
