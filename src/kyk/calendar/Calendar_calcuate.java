package kyk.calendar;

import java.util.Scanner;

public class Calendar_calcuate {

	private static final int max_day[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 해당 값들 배열로 저장 및 static fianl로 고정

	public int get_max_day(int month) { // 입력에 따른 해당 총 날짜 수 반한
		return max_day[month - 1];
	}

	public static void calendar_calcuate1() {
		Calendar_calcuate cal = new Calendar_calcuate(); // 위 메서드를 사용하기 위해 생성자 선언

		System.out.printf("반복횟수를 입력하세요: ");
		Scanner input_repeat = new Scanner(System.in);
		int repeat = input_repeat.nextInt();
		
		
		for(int i = 0; i < repeat; i++) { // 반복 입력에 따른 반복문 활용해보기
			System.out.printf("전체 일자를 확인하고 싶은 달을 입력하세요: ");
			Scanner input_month = new Scanner(System.in);
			int month = input_month.nextInt();
			System.out.printf(month + "월은 " + "%d일까지 있습니다.\n", cal.get_max_day(month));
			System.out.println("");
		}
		
		System.out.println("반복 종료");
		

		
//      다른 방법 switch문 활용

//		switch (month) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.println(month + "월은 31일까지 있습니다.");
//			System.out.println(" ");
//			break;
//
//		case 2:
//			System.out.println(month + "월은 28일까지 있습니다.");
//			System.out.println(" ");
//			break;
//
//		case 4, 6, 9, 11:
//			System.out.println(month + "월은 30일까지 있습니다.");
//			System.out.println(" ");
//			break;
//
//		default:
//			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
//			System.out.println(" ");
//			break;
//
//		}

	}
}
