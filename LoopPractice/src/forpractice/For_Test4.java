package forpractice;
import java.util.Scanner;
public class For_Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int n = sc.nextInt();
		//숫자 입력 받기
		float sum=0;
		for(int i=1; i<=n; i++) {
			sum += (float)1/i;
		}
		System.out.printf("%.2f",sum);
		
	}

}
