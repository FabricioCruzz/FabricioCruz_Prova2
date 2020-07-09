package br.edu.univas.main;

import java.util.Scanner;

public class Questao_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] nota = new int[99999999];
		int contador = 0;
		
		for(int i = 0; i < nota.length - 1; i++) {
			nota[i] = scanner.nextInt();
			if (nota[i] == 0) {
				break;
			}
			if (nota[i] < 1 || nota[i] > 7 && nota[i] != 0) {
				while(nota[i] < 1 || nota[i] > 7 && nota[i] != 0) {
					nota[i] = scanner.nextInt();
				}
			}
			contador++;
		}
		
		for(int i = 0; i < contador; i++) {
			if (nota[i] == 1) {
				System.out.println("DÓ");
			}
			else if (nota[i] == 2) {
				System.out.println("RÉ");
			}
			else if (nota[i] == 3) {
				System.out.println("MI");
			}
			else if (nota[i] == 4) {
				System.out.println("FÁ");
			}
			else if (nota[i] == 5) {
				System.out.println("SOL");
			}
			else if (nota[i] == 6) {
				System.out.println("LÁ");
			}
			else if (nota[i] == 7) {
				System.out.println("SI");
			}
		}
		
		scanner.close();
	}

}
