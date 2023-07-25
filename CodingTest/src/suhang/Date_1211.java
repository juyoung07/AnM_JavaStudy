package suhang;
import java.util.Scanner;
public class Date_1211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, mon, date;
		String S_mon, S_date;
		System.out.print("년도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		mon = sc.nextInt();
		System.out.print("일을 입력하세요: ");
		date = sc.nextInt();
		
		if(mon<10 && date<10) {
			S_mon = "0" + mon;
			S_date = "0" + date;
			System.out.println(year+"."+S_mon+"."+S_date);
		}
		else if(mon<10 && date>10) {
			S_mon = "0" + mon;
			System.out.println(year+"."+S_mon+"."+date);
		}
		else if(mon>10 && date<10) {
			S_date = "0" + date;
			System.out.println(year+"."+mon+"."+S_date);
		}
		else {
			System.out.println(year+"."+mon+"."+date);
		}
		

	}

}
