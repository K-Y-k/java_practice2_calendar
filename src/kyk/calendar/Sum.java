package kyk.calendar;

import java.util.Scanner;

public class Sum {

	public static void Sum_calculate() {
		
		System.out.printf("두 수를 입력하세요 ex) 5 10:");
		Scanner input_number = new Scanner(System.in);
		String number = input_number.next();
		
		String []number_split = number.split(",");		
		
		int first_number = Integer.parseInt(number_split[0]);
		int second_number = Integer.parseInt(number_split[1]);
		
		int result = first_number + second_number;
		
		System.out.println("두 수의 합은 " + result + "입니다.");
		
		input_number.close();
	}

}
