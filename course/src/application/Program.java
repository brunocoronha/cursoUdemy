package application;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		method2();
		System.out.println("End of program");
		
	}
	
	public static void method2() {
		try (Scanner sc = new Scanner(System.in)) {
			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid Position");
			}catch (InputMismatchException e) {
				System.out.println("Invalid Key");
			}finally {
				System.out.println("Programa rodou e finalizou");
			}
		}
	}
	
}
