package com.day4;

import java.util.Scanner;

public class Test1_1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		String str;
		
		System.out.println("�� �Է�");
		su = sc.nextInt();
		
		if (su%3==0 && su%4==0) {
			str = "3�� 4�� ����Դϴ�";
		}else if (su%3==0) {
			str = "3�� ����Դϴ�";
		}else if (su%4==0) {
			str = "4�� ����Դϴ�";
		}else {
			str = "3�� 4�� ����� �ƴմϴ�";
		}
		
		System.out.println(str);
		
		

	}

}
