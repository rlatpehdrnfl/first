package com.day7;

import java.util.Scanner;

public class Test5 {

	String jumin;
	int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
	int i,tot,su;

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length()!=14) {		//배열 length만 괄호가 없음. 모든 곳에서의 개수를 세는 length는 괄호가 있음
			System.out.println("입력오류");
			//stop

		}

		tot = 0;
	}

	public void yeonsan() {
		for(i=0;i<12;i++) {

			if(i>=6) {//주민번호 뒷자리
				tot += chk[i] * Integer.parseInt(jumin.substring(i+1,i+2));


			}else {//생년월일
				tot += chk[i] * Integer.parseInt(jumin.substring(i,i+1));
			}
		}
		su = 11 - tot % 11;
		su = su % 10;
	}

	public void result() {
		if(su==Integer.parseInt(jumin.substring(13))) {
			System.out.println("정확한 주민번호");			
		}else {
			System.out.println("틀린 주민번호");
		}
	}


	public static void main(String[] args) {
		
		Test5 ob = new Test5();
		
		ob.input();
		ob.yeonsan();
		ob.result();
		
		
	}
}
