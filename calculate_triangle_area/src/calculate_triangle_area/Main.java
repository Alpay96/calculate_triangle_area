package calculate_triangle_area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the length for the 1. side. : ");
		a = scan.nextInt();

		System.out.print("Enter the length for the 2. side. : ");
		b = scan.nextInt();

		System.out.print("Enter the length for the 3. side. : ");
		c = scan.nextInt();

		float sum = a + b + c;
		float u = sum / 2;

		double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.print("Area : " + area);
	}
}