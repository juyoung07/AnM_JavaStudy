package forpractice;

public class For_Test1 {

	public static void main(String[] args) {
		int i;
		char x = 'X';
		for(i=1; i<=100; i++) {
			if((i%10)==3 || (i%10)==6 || (i%10)==9) {
				System.out.print(x + " ");
			}
			else {
				System.out.print(i + " ");
			}
			if(i%10==0) {
				System.out.println();
			}
		}

	}

}
