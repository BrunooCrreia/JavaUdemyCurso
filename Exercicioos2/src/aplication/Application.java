package aplication;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual numero deseja multiplicar");
		int n = sc.nextInt();
		
		for (int i = 1;i < 10;i++) {
			__int result = i*n;
			System.out.println(i +" x "+result);
		}		
			
		}
	

}
