package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac he so cua chuong trinh ax^2 + bx + c = 0:");
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		System.out.print("Nhap c: ");
		double c = sc.nextDouble();

		double delta = b * b - 4 * a * c;

		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phuong trinh co 2 nghiem phan biet: " + x1 + " va" + x2);
		} else if (delta == 0) {
			double x = -b / (2 * a);
			System.out.println("Phuong trinh co nghiem kep: " + x);
		} else {
			System.out.println("Phuong trinh vo nghiem");
		}
	}

}
