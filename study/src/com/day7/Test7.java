package com.day7;


import java.util.Scanner;

public class Test7 {

	int width,height,area;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("너비?");
		width = sc.nextInt();

		System.out.println("높이?");
		height = sc.nextInt();

	}

	public void yeonsan() {

		area = width * height;

		System.out.println(area);
	}

	public static void main(String[] args) {

		Test7 ab = new Test7();

		ab.input();
		ab.yeonsan();


	}

// 사각형 클래스:

// Rectangle 클래스를 만들어보세요.
// 사각형의 너비와 높이를 나타내는 속성을 가지고 있어야 합니다.
// 너비와 높이를 설정하는 메서드를 구현하세요.
// 사각형의 넓이를 계산하는 메서드를 구현하세요.







}


