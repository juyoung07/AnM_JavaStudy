package forpractice;

public class EvenSum1to100 {

	public static void main(String[] args) {
		int even = 0;
		for(int i = 0; i<=100; i++) {
			if(i%2==0) {
				even = even+i;
			}//if
		}//fo
		System.out.println("1부터 100사이의 짝수의 합: " + even);
	}//main

}
