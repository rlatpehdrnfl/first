package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6_2 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, tot;
		String name;

		System.out.print("이름이 뭐에요?");
		name = br.readLine();
		
		System.out.print("국어 성적을 입력하세요");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 성적을 입력하세요");
		eng = Integer.parseInt(br.readLine());
		
		tot = kor + eng;
		
		System.out.printf("%s의 총점은 %d입니다.",name,tot);
		
		
				










	}

}
