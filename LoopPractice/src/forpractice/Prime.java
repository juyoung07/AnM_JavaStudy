package forpractice;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		boolean prime = false ;
		int n = sc.nextInt();
		
		for(int i=2; i<n; i++) {
		// 1은 소수도 합성수도 아니기 때문에 2부터 시작
			if(n%i==0) {
				prime = true;
				break;
			}
			break;
		}
		
		if(prime) {
			System.out.println(n + "은(는) 소수가 아닙니다.");
		}
		else {
			System.out.println(n + "은(는) 소수입니다.");
		}
			
	}

}
