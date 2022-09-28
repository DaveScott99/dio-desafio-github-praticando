package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<Integer> instrutor = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Qual a quantidade de estudades para o curso A: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			instrutor.add(a);
		}
		
		System.out.print("Qual a quantidade de estudades para o curso B: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int b = sc.nextInt();
			instrutor.add(b);
		}
		
		System.out.print("Qual a quantidade de estudades para o curso C: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int c = sc.nextInt();
			instrutor.add(c);
		}
		
		System.out.println("Total students: " + instrutor.size());
		
		sc.close();
	}

}
