package com.day7;

import java.util.Scanner;

public class Test5 {

	String jumin;
	int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
	int i,tot,su;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length()!=14) {		//�迭 length�� ��ȣ�� ����. ��� �������� ������ ���� length�� ��ȣ�� ����
			System.out.println("�Է¿���");
			//stop

		}

		tot = 0;
	}

	public void yeonsan() {
		for(i=0;i<12;i++) {

			if(i>=6) {//�ֹι�ȣ ���ڸ�
				tot += chk[i] * Integer.parseInt(jumin.substring(i+1,i+2));


			}else {//�������
				tot += chk[i] * Integer.parseInt(jumin.substring(i,i+1));
			}
		}
		su = 11 - tot % 11;
		su = su % 10;
	}

	public void result() {
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ");			
		}else {
			System.out.println("Ʋ�� �ֹι�ȣ");
		}
	}


	public static void main(String[] args) {
		
		Test5 ob = new Test5();
		
		ob.input();
		ob.yeonsan();
		ob.result();
		
		
	}
}
