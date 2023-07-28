package forpractice;
import java.util.Scanner;
public class For_Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 --> ");
		char n = sc.next().charAt(0);
		
		for(char ch='A'; ch<=n; ch++) {
			
			int j = (ch-'A')*2+1;
			
			for(int i=1; i<=j; i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}
