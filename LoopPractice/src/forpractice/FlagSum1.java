package forpractice;

import java.util.Scanner;
public class FlagSum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				sum -= i;
			}
			else if(i%2==1) {
				sum += i;
			}
		}
		System.out.println(n + "까지 (+)홀수 (-)짝수의 합: " + sum);
	}
}
