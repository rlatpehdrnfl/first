package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		String str = "";
		
		System.out.print("���ڸ� �Է��ϼ���");
		num = Integer.parseInt(br.readLine());
		
		
//���� if��
		if (num%2==0) {
			str = "¦��";
		}
		
		if (num%2!=0) {
			str = "Ȧ��";
		}
				
		System.out.println(num + ":"+ str);
		
//if~else��
		if (num%2==0) {
			str = "¦��";
		}else 
			str = "Ȧ��";
		
		System.out.println(num + ":" + str);
		
		
	}

}
