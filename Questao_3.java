package br.edu.univas.main;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double folhaPagamento = 0;
		double salario2 = 0;
		double folhaPagamento2 = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o salário do funcionário:");
			folhaPagamento += scanner.nextDouble();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o salário do funcionário que receberá aumento:");
			salario2 = scanner.nextDouble();
			
			folhaPagamento2 += salario2 + (salario2 * 0.15);
		}
		
		System.out.println("A Folha de Pagamento SEM aumento é de: " + folhaPagamento);
		
		System.out.println("A Folha de Pagamento COM aumento de 15% é de: " + folhaPagamento2);
		
		scanner.close();
	}

}
