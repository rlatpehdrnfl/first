package com.day7;

import java.util.Scanner;

public class Test3 {

	String name;
	int kor;
	String pan="";
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름?");
		name = sc.next();
		
		System.out.println("국어?");
		kor = sc.nextInt();
		
	}
	
	public void output() {
		
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
		
		
		System.out.println(name + ":" + pan);
	}
	
	
	
}
