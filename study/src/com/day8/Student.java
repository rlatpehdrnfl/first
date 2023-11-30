package com.day8;

import java.util.Scanner;

public class Student {


	int inwon;
	Record[] rec;

	Scanner sc = new Scanner(System.in);

	public void set() {

		do {
			System.out.println("인원수?");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>11);

		rec = new Record[inwon];
	}

	public void input() {
		String[] title = {"국어?","영어?","수학?"};

		for(int i=0;i<inwon;i++) {
			rec[i] = new Record();

			System.out.println((i+1) + "번째 이름?");
			rec[i].name = sc.next();

			for(int j=0;j<3;j++) {
				System.out.println(title[j]);
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];

			}

			rec[i].avg = rec[i].tot / 3;
		}
	}
	private void ranking() {//내부사람들은 접근가능 외부사람들은 접근불가

		int i,j;

		//석차 초기화
		for(i=0;i<inwon;i++) {
			rec[i].ranking=1;	
		}

		//석차 구하기(selection sort)
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {

				if(rec[i].tot>rec[j].tot) {
					rec[j].ranking++;
				}else if (rec[i].tot<rec[j].tot) {
					rec[i].ranking++;
				}

			}
		}
	}


	private void grade() {

		for (int i=0;i<inwon;i++) {

			int avg = rec[i].avg;
			String pan;

			if(avg>=90) {
				pan = "1등급";
			}else if(avg>=80) {
				pan = "2등급";
			}else if(avg>=70) {
				pan = "3등급";
			}else if(avg>=60) {
				pan = "4등급";
			}else {
				pan = "등급측정불가";
			}

			rec[i].pan = pan;

		}
	}

	public void print() {

		ranking();
		grade();


		for(int i=0;i<inwon;i++) {

			System.out.printf("%6s",rec[i].name);

			System.out.printf("%4d",rec[i].tot);
			System.out.printf("%4d",rec[i].avg);
			System.out.printf("%4s",rec[i].pan);
			System.out.printf("%4d\n",rec[i].ranking);
		}
	}
}

