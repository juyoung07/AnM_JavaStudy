package forpractice;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n%2==1) || (n%3==1) || (n%3==2)) {
			System.out.println(n + "은 소수이다.");
		}
		else {
			System.out.println(n + "은 소수가 아니다.");
		}

	}

}
