package forpractice;

import java.util.Scanner;
public class FlagSum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int even = 0, odd = 0, result;
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				even -= i;
			}
			else if(i%2==1) {
				odd += i;
			}
		}
		result = even + odd;
		System.out.println(n + "까지 (+)홀수 (-)짝수의 합: " + result);
	}
}
