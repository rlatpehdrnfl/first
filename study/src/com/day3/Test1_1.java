package com.day3;


public class Test1_1 {

	public static void main(String[] args) {
		
		float f = 0; //이 자체를 double로 인식하기 때문에 0.0f
		double d = 0.0;
		
		System.out.println(f);
		System.out.println(d);

		for (int i = 1; i <= 10000; i++) {
			
			f = f + 100000;
			d = d + 100000;
		
			
		}
	System.out.println("float:" + f/100000);
	System.out.println("double:" + d/100000);

	}

}
