package project1;

import java.util.Arrays;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[6];

		names[0] = "Jalindar";
		names[1] = "Amol";
		names[2] = "Rahul";
		names[3] = "Vishal";
		names[4] = "Komal";
		names[5] = "Krish";

		// retrive
		System.out.println(names[0]);
		System.out.println(names[4]);

		// update
		String a = names[3] = "Sau";
		System.out.println(a);

		System.out.println(names[3]);
		for (int i = 0; i < names.length; i++) {
			System.out.println(i);
			System.out.println(names[i]);
		}

		String[] cities = { "Pune", "Mumbai", "Banglore", "Kolkatta", "Chennai" };
		for (int i = cities.length - 1; i >= 0; i--) {
			System.out.println(i);
			System.out.println(cities[i]);
		}

//		String info="I am learning java";		

		String info = "I am learning js";
		String[] sy = info.split(" ");
		String[] sy2 = info.split("a");

		System.out.println(sy);

		System.out.println(Arrays.toString(sy));
		System.out.println(Arrays.toString(sy2));
//	    [I, am, learning, js]
//     	[I , m le, rning js]

//      program2

		String cityA="Nagpur";
		char[] aa=cityA.toCharArray();
		System.out.println(aa);
		//Nagpur
		System.out.println(Arrays.toString(aa));
		//[N, a, g, p, u, r]
		

		// program3
		String [] NameA= {"Amol","Jalindar","Pankaj","Shankar","Ram"};
		for(int i=0;i<NameA.length;i++) {
			System.out.println(NameA[i]);
		}
		
		for(String s:NameA) {
			System.out.println(s);
		}
		
		for(String aaa:NameA) {
			System.out.println(aaa);
		}
		
		int [] year= {11,22,33,44,55};
		for(int i=0;i<year.length;i++) {
			System.out.println(year[i]);
		}
		
		for(int aaaa:year) {
			System.out.println(aaaa+1);
			
		}
		
		
		//program4
		char[] nm= {'a','m','o','l'};
		String rev="";
		for(char ss:nm) {
			System.out.println(ss);
			rev=ss+rev;
		}
		System.out.println(rev);   //loma
		
		int[] num= {1,2,3,4,5,6,7,8,9};
		float avg=0;
		int sumA=0;
		for(int i:num) {
			System.out.println(i);
			sumA=sumA+i;
//			0+1==1
//		    1+2==3
//		    3+3==6
//		    6+4==10
//		    10+5=15
//		    15+6=21
//		    21+7=28
//		    28+8=36
//		    36+9=45
			
		}
		System.out.println(sumA);
		
		
		avg=sumA/num.length;
		System.out.println(avg);
		
	


	}

}
