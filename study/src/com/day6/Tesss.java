package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Tesss {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// 1에서 10 사이의 난수 생성
		int randomNumber = random.nextInt(10) + 1;

		System.out.println("1에서 10 사이의 숫자를 맞춰보세요!");

		for (int i = 0; i < 3; i++) {
			System.out.print("입력: ");
			int userGuess = scanner.nextInt();

			if (userGuess == randomNumber) {
				System.out.println("축하합니다! 정답입니다.");
				return; // 정답을 맞추면 프로그램 종료
			} else {
				System.out.println("틀렸습니다.");
			}
		}

		System.out.println("3번 안에 맞추지 못했습니다. 정답은 " + randomNumber + "입니다.");
	}


}



