package com.day4;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		/*6. 이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
		-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
		-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
		-평균이 60점 미만이면 불합격

		이름 ? 홍길동
		세과목 점수 ? 60 70 80
		이름 : 홍길동
		총점 : 210, 평균 : 70, 판정 :합격
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,avg;
		String name;
			
		System.out.println("이름 성적1 성적2 성적3");
		name = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		avg = (num1+num2+num3)/3;

	System.out.println("이름:" + name + "평균:" + avg + "판정: " );
	
	}

}
