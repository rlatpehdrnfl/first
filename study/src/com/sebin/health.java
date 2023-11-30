package com.sebin;

import java.util.Scanner;

public class health {


	int jumin,height,weight;

	String name;

	Scanner sc = new Scanner(System.in);


	public void input() {

		System.out.println("이름?");
		name = sc.next();

		System.out.println(height);
		height = sc.nextInt();

		System.out.println(weight);
		weight = sc.nextInt();

	}

	private void inputJumin() {
		
		System.out.println("주민등록번호?");
		jumin = sc.nextInt();
		
	}

	
	public void print() {
		
		inputJumin();
		
		System.out.printf("%4s",name);
		System.out.printf("%4d",jumin);
		System.out.printf("%4d",height);
		System.out.printf("%4d",weight);
		
	}
	
	
	
	
	
	
	
}
