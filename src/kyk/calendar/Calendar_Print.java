package kyk.calendar;

import java.util.Scanner;

public class Calendar_Print {
	
	private static final int max_day[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 해당 값들 배열로 저장 및 static fianl로 고정
	private static final int leap_max_day[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private static int get_max_day(int year, int month) { // 입력에 따른 해당 총 날짜 수 반한, 윤년에 따른 조건 포함
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return leap_max_day[month - 1];
		} else {
			return max_day[month - 1];
		}
	}

	public static void Calendar_print_calcualte(int year, int month, String week) {
		System.out.printf("    << %d년  %d월 >>\n", year, month);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("-----------------------");

		int max_day = Calendar_Print.get_max_day(year, month);
		int week_count = 0;
		
		
		// 요일에 따른 칸 띄우기 및 개행조건에 필요한 카운트 조정 선언
		if(week.equals("일")) { 
			week_count = 7;
		} else if(week.equals("월")) {
			System.out.printf("   ");
			week_count = 1;
		} else if(week.equals("화")) {
			System.out.printf("      ");
			week_count = 2;
		} else if(week.equals("수")) {
			System.out.printf("         ");
			week_count = 3;
		} else if(week.equals("목")) {
			System.out.printf("            ");
			week_count = 4;
		} else if(week.equals("금")) {
			System.out.printf("               ");
			week_count = 5;
		} else if(week.equals("토")) {
			System.out.printf("                  ");
			week_count = 6;
		}
		
		for (int i = 1; i <= max_day; i++) { // 마지막 날까지 반복 출력
			System.out.printf("%3d", i); // %3d의 3은 3칸까지 선정하기에 칸 조절
			if (i % 7 == 7 - week_count) { // 7일 단위로 나눈 나머지에 따라 개행 조절
				System.out.println("");
			}
		}
	}

	public static void Calendar_print() {

		System.out.printf("년도를 입력하세요: ");
		Scanner input_year = new Scanner(System.in);
		int year = input_year.nextInt();

		System.out.printf("월을 입력하세요: ");
		Scanner input_month = new Scanner(System.in);
		int month = input_month.nextInt();
		
		System.out.println("시작 요일을 입력하세요: ex) 일 월 화 수 목 금 토");
		Scanner input_week = new Scanner(System.in);
		String week = input_week.next();

		Calendar_Print.Calendar_print_calcualte(year, month, week);
		System.out.println("\n");

//		switch문 방식
//		
//		switch (month) {
//		case 1, 3, 5, 7, 8, 10, 12:
//			System.out.printf(" << %d년  %d월 >>\n", 2017, month);
//			System.out.println("일 월 화 수 목 금 토");
//			System.out.println("-----------------");
//			System.out.println(" 1  2  3  4  5  6  7");
//			System.out.println(" 8  9 10 11 12 13 14");
//			System.out.println("15 16 17 18 19 20 21");
//			System.out.println("22 23 24 25 26 27 28");
//			System.out.println("29 30");
//			System.out.println("");
//			break;
//			
//		case 2:
//			System.out.printf(" << %d년  %d월 >>\n", 2017, month);
//			System.out.println("일 월 화 수 목 금 토");
//			System.out.println("-----------------");
//			System.out.println(" 1  2  3  4  5  6  7");
//			System.out.println(" 8  9 10 11 12 13 14");
//			System.out.println("15 16 17 18 19 20 21");
//			System.out.println("22 23 24 25 26 27 28");
//			System.out.println("");
//			break;
//
//		case 4, 6, 9, 11:
//			System.out.printf(" << %d년  %d월 >>\n", 2017, month);
//			System.out.println("일 월 화 수 목 금 토");
//			System.out.println("-----------------");
//			System.out.println(" 1  2  3  4  5  6  7");
//			System.out.println(" 8  9 10 11 12 13 14");
//			System.out.println("15 16 17 18 19 20 21");
//			System.out.println("22 23 24 25 26 27 28");
//			System.out.println("29 30");
//			System.out.println("");
//			break;
//
//		}

	}
}
