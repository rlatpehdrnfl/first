package com.day7;


import java.util.Scanner;

public class Test7 {

	int width,height,area;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("�ʺ�?");
		width = sc.nextInt();

		System.out.println("����?");
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

// �簢�� Ŭ����:

// Rectangle Ŭ������ ��������.
// �簢���� �ʺ�� ���̸� ��Ÿ���� �Ӽ��� ������ �־�� �մϴ�.
// �ʺ�� ���̸� �����ϴ� �޼��带 �����ϼ���.
// �簢���� ���̸� ����ϴ� �޼��带 �����ϼ���.







}


