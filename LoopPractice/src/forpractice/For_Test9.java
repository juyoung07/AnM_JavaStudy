package forpractice;
import java.util.Scanner;
public class For_Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력 --> ");
		int n = sc.nextInt();
		for(int i=1; i<=n*5; i++) {
			System.out.print(i);
			if(i%5==0)
				System.out.println();
		}

	}

}
