package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ToolTipManager;

public class test6_5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng;
		double tot;

		System.out.print("안녕하세요. 국어점수를 입력하세요.");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("안녕하세요. 영어점수를 입력하세요.");
		eng = Integer.parseInt(br.readLine());
				
		tot = kor + eng;
		
		System.out.printf("당신의 총점은 %g 입니다.",tot);
		

	}

}
