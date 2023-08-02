package forpractice;
import java.util.Scanner;
public class For_Test7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("숫자를 입력하세요: ");
	    int num = scanner.nextInt();
	        
	    for (int i = num; i >= 1; i--) {
	    //z, y, x를 찍으려고 (z의 아스키코드 -i)
	        for (char ch = 'Z'; ch >= 'Z' - (num - i); ch--) {
	              System.out.print(ch);
	         }
	         System.out.println();
	    }
	}
}


