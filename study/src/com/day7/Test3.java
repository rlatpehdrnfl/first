package com.day7;

import java.util.Scanner;

public class Test3 {

	String name;
	int kor;
	String pan="";
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸�?");
		name = sc.next();
		
		System.out.println("����?");
		kor = sc.nextInt();
		
	}
	
	public void output() {
		
		if(kor>=90) {
			pan = "��";
		}else if(kor>=80) {
			pan = "��";
		}else if(kor>=70) {
			pan = "��";
		}else if(kor>=60) {
			pan = "��";
		}else {
			pan = "��";
		}
		
		
		System.out.println(name + ":" + pan);
	}
	
	
	
}
