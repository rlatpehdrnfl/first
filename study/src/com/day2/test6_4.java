package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class test6_4 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int width,height;
		double area;
		
		System.out.print("width?");
		width = Integer.parseInt(br.readLine());
		
		System.out.print("height?");
		height = Integer.parseInt(br.readLine());
		
		area = width * height /2;
		
		System.out.printf("넓이는 %g입니다.",area);
		
		

	}

	


}
