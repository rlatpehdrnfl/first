package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2_1 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
		
		System.out.print("첫번째 숫자가 무엇입니까?");
		num1 = Integer.parseInt(br.readLine());
				
		System.out.print("두 번째 숫자가 무엇입니까?");
		num2 = Integer.parseInt(br.readLine());
				
		System.out.printf("%d+%d=%d\t",num1,num2,num1+num2);
		
		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		
		System.out.printf("%d*%d=%d\t",num1,num2,num1*num2);
		
		System.out.printf("%d%%%d=%d\n",num1,num2,num1%num2);
		
		
		
		
	}

}
