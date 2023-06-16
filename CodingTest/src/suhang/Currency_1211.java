package suhang;

import java.util.Scanner;
import java.util.Scnner;
public class Currency_1211 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시요 >> ");
		int money = sc.nextInt();
		
		int dhaks, aks, dhcjs, cjs, dhqor, qor, dhtlq, tlq, dh, dlf;
		
		dhaks = money/50000;
		aks = (money%50000)/10000;
		dhcjs = ((money%50000)%10000)/5000;
		cjs = (((money%50000)%10000)%5000)/1000;
		dhqor = ((((money%50000)%10000)%5000)%1000)/500;
		qor = (((((money%50000)%10000)%5000)%1000)%500)/100;
		dhtlq = ((((((money%50000)%10000)%5000)%1000)%500)%100)/50;
		tlq = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)/10;
		dh = ((((((((money%50000)%10000)%5000)%1000)%500)%100)%50)%10)/5;
		dlf = (((((((((money%50000)%10000)%5000)%1000)%500)%100)%50)%10)%5)/1;
		
		System.out.println("오만원권 "+dhaks+"매");
		System.out.println("만원권 "+aks+"매");
		System.out.println("오천원권 "+dhcjs+"매");
		System.out.println("천원권 "+cjs+"매");
		System.out.println("오백원권 "+dhqor+"매");
		System.out.println("백원권 "+qor+"매");
		System.out.println("오십원 "+dhtlq+"개");
		System.out.println("십원 "+tlq+"개");
		System.out.println("오원 "+dh+"개");
		System.out.println("일원 "+dlf+"개");

	}

}
