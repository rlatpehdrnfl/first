package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Tesss {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// 1���� 10 ������ ���� ����
		int randomNumber = random.nextInt(10) + 1;

		System.out.println("1���� 10 ������ ���ڸ� ���纸����!");

		for (int i = 0; i < 3; i++) {
			System.out.print("�Է�: ");
			int userGuess = scanner.nextInt();

			if (userGuess == randomNumber) {
				System.out.println("�����մϴ�! �����Դϴ�.");
				return; // ������ ���߸� ���α׷� ����
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}

		System.out.println("3�� �ȿ� ������ ���߽��ϴ�. ������ " + randomNumber + "�Դϴ�.");
	}


}



