package kyk.calendar;

import java.util.Scanner;

public class calendar_practice {

	public static void main(String[] args) {

		System.out.println("일 월 화 수 목 금 토");
		System.out.println("-----------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("");

		while (true) {
			System.out.println("메뉴를 선택해주세요: ");
			System.out.println("1. 두수의 합");
			System.out.println("2. 달의 전체일 확인");
			System.out.println("3. 달의 출력");
			System.out.println("-1. 프로그램 종료");

			Scanner input_menu = new Scanner(System.in);
			int menu = input_menu.nextInt();

			if (menu == 1) {
				Sum.Sum_calculate();
			} else if (menu == 2) {
				Calendar_fianalDay_calcuate.calendar_calcuate1();
			} else if (menu == 3) {
				Calendar_Print.Calendar_print();
			} else if (menu == -1) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
