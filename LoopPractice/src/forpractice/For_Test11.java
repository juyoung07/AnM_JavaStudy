package forpractice;

public class For_Test11 {

	public static void main(String[] args) {
		int count=0;
		int hun=0, ten=0, one=0;
		for(int i=100; i<=999; i++) {
			hun=i/100;
			//백의 자리 수 구하기
			hun=hun*hun*hun;
			//백의 자리 수의 세제곱
			ten=(i%100)/10;
			//십의 자리 수 구하기
			ten=ten*ten*ten;
			//십의 자리 수의 세제곱
			one=(i%100)%10;
			//일의 자리 수 구하기
			one=one*one*one;
			//일의 자리 수의 세제곱
			if((hun+ten+one)==i) {
			//각 자리를 세제곱 후 더해서 자신이 되는 수 구하기
				count += 1;
				System.out.println(count + " narcissus: " + i);
			}
		}

	}

}
