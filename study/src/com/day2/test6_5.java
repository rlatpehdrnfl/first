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

		System.out.print("�ȳ��ϼ���. ���������� �Է��ϼ���.");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("�ȳ��ϼ���. ���������� �Է��ϼ���.");
		eng = Integer.parseInt(br.readLine());
				
		tot = kor + eng;
		
		System.out.printf("����� ������ %g �Դϴ�.",tot);
		

	}

}
