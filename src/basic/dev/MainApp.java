package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguyen can kiem tra: ");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println(n + " la so nguyen duong");
		} else if (n < 0) {
			System.out.println(n + " la so nguyen am");
		} else {
			System.out.println("0 khong phai la so nguyen duong hay am");
		}

	}

}
