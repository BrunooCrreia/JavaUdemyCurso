
import java.util.InputMismatchException;
import java.util.Scanner;

public class application {

	public static void main(String[] args) {

		method1();

	}

	public static void method1() {
		System.out.println("**method1 Start**");
		method2();
		System.out.println("**method2 Start**");

	}

	private static void method2() {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position");

		} catch (InputMismatchException e) {
			System.out.println("imput error");

		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
