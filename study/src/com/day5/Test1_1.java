package com.day5;

import java.util.Iterator;
import java.util.Scanner;

public class Test1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				int[] num = new int[5];
		
		System.out.println("5���� ���� �Է�");
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(num.length + "��");
	
		for(int i=0;i<num.length;i++) {
			System.out.println("num[" + i + "]: " + num[i]);
		}
	}

}
