package DatumErweiterung;

import java.util.Scanner;

public class DatumErweiterung {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int extra = sc.nextInt();
		sc.close();


		minute += extra;
		hour += minute / 60;
		minute %= 60;


		day += hour / 24;
		hour %= 24;


		while (true) {
			int monthDays;
			if (month == 2) {
				monthDays = 28;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				monthDays = 30;
			} else {
				monthDays = 31;
			}

			if (day <= monthDays) {
				break;
			}


			day -= monthDays;
			month++;


			if (month > 12) {
				month = 1;
				year++;
			}
		}

		System.out.println(year + " " + month + " " + day + " " + hour + " " + minute);
	}
}
