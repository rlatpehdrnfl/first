package com.day5;

import java.util.function.BiConsumer;

public class Assignment1_1 {

	public static void main(String[] args) {

		//1���� 100������ ��
		 
		int i,sum=0;

		for(i=1;i<=100;i++) {
			
			sum+=i;
			
		}
		System.out.println(sum);
		
		
		//1���� 100������ ¦�� ��
		
		int i1,sum1=0;
		
		for(i1=2;i1<=100;i1+=2) {
			sum1+=i1;
		}
		
			System.out.println(sum1);
			
			
		//1���� 100������ Ȧ�� ��
			
		int i2,sum2=0;
		
		for(i2=1;i2<=100;i2+=2) {
			sum2+=i2;
		}
			System.out.println(sum2);
			
			
			
	}

}
