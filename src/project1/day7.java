package project1;

import java.util.Arrays;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//program 1
		int[] numbers=new int[5];
		numbers[0]=11;
		numbers[1]=22;
		numbers[2]=33;
		numbers[3]=44;
		numbers[4]=55;
		
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(i);
			System.out.println(numbers[i]);
			
		}
		
		for(int aa:numbers) {
			System.out.println(aa);
		}
		
		//same program
		int[] num= {1,2,3,4,5,6};
		for(int i=0;i<num.length;i++) {
//			System.out.println(i);//index
			System.out.println(num[i]);//values
		}
		
		for(int bb:num) {
			System.out.println(bb);
		}
		
		
		//program 2
		

		int[][] numbersB=new int [3][4];
		numbersB[0][0]=11;
		numbersB[0][1]=22;
		numbersB[0][2]=33;
		numbersB[0][3]=44;
	
		
		numbersB[1][0]=1;
		numbersB[1][1]=2;
		numbersB[1][2]=3;
		numbersB[1][3]=4;
	
		
		numbersB[2][0]=10;
		numbersB[2][1]=20;
		numbersB[2][2]=30;
		numbersB[2][3]=40;
	
		
			
		for(int i=0;i<numbersB.length;i++) {
			System.out.println(i);
			System.out.println(numbersB[i]);
			System.out.println(Arrays.toString(numbersB));
		}

			

		for (int i = 0; i < numbersB.length; i++) {
			int r[] = numbersB[i];
			for (int j = 0; j < r.length; j++) {
				System.out.println(r[j]);
			}
		}

		// for each

		for (int[] row : numbersB) {
			for (int col : row) {
				System.out.println(col);
			}
		}

		for (int[] row : numbersB) {
			for (int col2 : row) {
				System.out.println(col2);
			}
		}

		int[][][] numbersE = { { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } },
				{ { 111, 222, 333 }, { 444, 555, 666 }, { 777, 888, 999 } }, { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },

		};

		System.out.println(numbersE[1][1][1]);
		for (int[][] rrs : numbersE) {
			for (int[] rrr : rrs) {
				for (int r : rrr) {
					System.out.println(r);
				}
			}
		}

		for (int i = 0; i < numbersE.length; i++) {
			int[][] rrr = numbersE[i];
			for (int k = 0; k < rrr.length; k++) {
				int ccc[] = rrr[k];
				for (int j = 0; j < ccc.length; j++) {
					System.out.println(ccc[j]);
				}
			}
		}
	}

}
