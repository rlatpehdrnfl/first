package com.day7;

import java.util.Scanner;

public class Test1 {

	String name;
	int kor,eng,mat;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("�̸� ���� ���� ����");


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
	}

	public void outPut() {

		System.out.println(name + ":" + (kor+eng+mat) + "��");
	}
}


