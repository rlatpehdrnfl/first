package com.day4;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		/*6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
		-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
		-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
		-����� 60�� �̸��̸� ���հ�

		�̸� ? ȫ�浿
		������ ���� ? 60 70 80
		�̸� : ȫ�浿
		���� : 210, ��� : 70, ���� :�հ�
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,avg;
		String name;
			
		System.out.println("�̸� ����1 ����2 ����3");
		name = sc.next();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		avg = (num1+num2+num3)/3;

	System.out.println("�̸�:" + name + "���:" + avg + "����: " );
	
	}

}
