package suhang;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("정수 3개를 입력하시오 >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a<c && b<c && (a+b)>c) {
			System.out.println("삼각형이 됩니다.");
		}
		else if(a<b && c<b && (a+c)>b) {
			System.out.println("삼각형이 됩니다.");
		}
		else if(b<a && c<a && (b+c)>a) {
			System.out.println("삼각형이 됩니다.");
		}
		

	}

}
