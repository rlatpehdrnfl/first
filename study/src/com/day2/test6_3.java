package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6_3 {

	public static void main(String[] args) throws IOException {
		
		int weight, height, A;
		String name;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸��� ������ �� ������");
		name = br.readLine();
				
		System.out.print("Ű�� ������?");	
		height = Integer.parseInt(br.readLine());
		
		System.out.print("�����԰� ���̿���?");
		weight = Integer.parseInt(br.readLine());
		
		A = height-weight;
		
		System.out.printf("%s�� Ű-�����Դ� %d�Դϴ�.",name,A);
				

	}

}
