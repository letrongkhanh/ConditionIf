package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 3 canh a, b, c cua tam giac");
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		System.out.print("Nhap c: ");
		int c = sc.nextInt();

		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			System.out.println("Day la 3 canh cua mot tam giac");
		} else {
			System.out.println("Khong phai la 3 canh cua mot tam giac");
		}
	}

}
