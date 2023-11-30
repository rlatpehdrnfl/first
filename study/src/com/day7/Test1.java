package com.day7;

import java.util.Scanner;

public class Test1 {

	String name;
	int kor,eng,mat;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름 국어 영어 수학");


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
	}

	public void outPut() {

		System.out.println(name + ":" + (kor+eng+mat) + "점");
	}
}


