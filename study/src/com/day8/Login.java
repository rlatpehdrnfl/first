package com.day8;

import java.util.Scanner;

public class Login {

	int inwon;
	Record[] rec;

	Scanner sc = new Scanner(System.in);

	public void input() {

		String name;
		int age;

		System.out.println("�̸�?");
		name = sc.next();

		System.out.println("����?");
		age = sc.nextInt();

	}

	public void yeonsan() {
		int age = 0;

		if (age<19 && age>43) {
			System.out.println("MZ���밡 �ƴմϴ�");
		}else {
				System.out.println("MZ�����Դϴ�");
			}

		
	}



}





