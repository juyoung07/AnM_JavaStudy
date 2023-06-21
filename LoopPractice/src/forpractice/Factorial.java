package forpractice;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, sum = 1;
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		for(i=1; i<=n; i++) {
			sum *= i;
			
		}
		System.out.println(n  + "! = " + sum);
	}

}
