package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6_3 {

	public static void main(String[] args) throws IOException {
		
		int weight, height, A;
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름이 뭐에요 오 뭐예요");
		name = br.readLine();
				
		System.out.print("키가 뭐예요?");	
		height = Integer.parseInt(br.readLine());
		
		System.out.print("몸무게가 몇이에요?");
		weight = Integer.parseInt(br.readLine());
		
		A = height-weight;
		
		System.out.printf("%s의 키-몸무게는 %d입니다.",name,A);
				

	}

}
