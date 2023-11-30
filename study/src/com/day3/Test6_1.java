package com.day3;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;

public class Test6_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int kor;

		System.out.print("이름?");
		name = sc.next();

		System.out.print("국어성적?");
		kor = sc.nextInt();

		String pan;

		if(kor>=90) {
			pan = "수";
		}else if(kor>=80) {
			pan = "우";
		}else if(kor>=70) {
			pan = "미";
		}else if(kor>=60) {
			pan = "양";
		}else {
			pan = "가";
		}

		System.out.println(pan);

	}

}
