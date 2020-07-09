package br.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] moradorA = new double[12];
		double[] moradorB = new double[12];
		
		double maiorContaA = 0;
		double menorContaA = 0;
		double mediaContasA = 0;
		
		double maiorContaB = 0;
		double menorContaB = 0;
		double mediaContasB = 0;
		
		for(int i = 0; i < 12; i++) {
			System.out.println("Informe a conta do mês " + (i + 1) + " do morador A:" );
			moradorA[i] = scanner.nextDouble();
			
			mediaContasA += moradorA[i];
			
			if (i == 1) {
				maiorContaA = moradorA[i];
				menorContaA = moradorA[i];
			}
			else if (moradorA[i] > maiorContaA) {
				maiorContaA = moradorA[i];
			}
			else if (moradorA[i] < menorContaA) {
				menorContaA = moradorA[i];
			}
		}
		
		for(int i = 0; i < 12; i++) {
			System.out.println("Informe a conta do mês " + (i + 1) + " do morador B:" );
			moradorB[i] = scanner.nextDouble();
			
			mediaContasB += moradorB[i];
			
			if (i == 1) {
				maiorContaB = moradorB[i];
				menorContaB = moradorB[i];
			}
			else if (moradorB[i] > maiorContaB) {
				maiorContaA = moradorB[i];
			}
			else if (moradorB[i] < menorContaB) {
				menorContaB = moradorB[i];
			}
			
		}
		System.out.println("MORADOR A:");
		System.out.println("A maior conta paga foi no valor de: " + maiorContaA);
		System.out.println("A menor conta paga foi no valor de: " + menorContaA);
		System.out.println("A média das contas pagas foi de: " + mediaContasA / 12);
		
		System.out.println("MORADOR B:");
		System.out.println("A maior conta paga foi no valor de: " + maiorContaB);
		System.out.println("A menor conta paga foi no valor de: " + menorContaB);
		System.out.println("A média das contas pagas foi de: " + mediaContasB / 12);
		scanner.close();
	}
}
