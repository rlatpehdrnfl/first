package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6_2 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor, eng, tot;
		String name;

		System.out.print("�̸��� ������?");
		name = br.readLine();
		
		System.out.print("���� ������ �Է��ϼ���");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("���� ������ �Է��ϼ���");
		eng = Integer.parseInt(br.readLine());
		
		tot = kor + eng;
		
		System.out.printf("%s�� ������ %d�Դϴ�.",name,tot);
		
		
				










	}

}
