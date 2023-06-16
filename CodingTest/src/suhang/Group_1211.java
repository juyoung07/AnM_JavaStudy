package suhang;

import java.util.Scanner;
public class Group_1211 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String min = "minus", pl = "plus", ev = "even", od = "odd";
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		if(num>0) {
			System.out.println(pl);
		}
		else if(num<0) {
			System.out.println(min);
		}
		
		if(num%2==0) {
			System.out.println(ev);
		}
		else if((num%2==1) || (num%2==-1)) {
			System.out.println(od);
		}
		
		
		
		

	}

}
