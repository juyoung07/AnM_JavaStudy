package forpractice;

public class For_Test8 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i*11<=100) {
			// 1학년 윤주영의 번호는 11번
				System.out.print(11*i + " ");
				sum += 1;
			}
		}
		System.out.print("\n개수 = " + sum + "개");

	}

}
