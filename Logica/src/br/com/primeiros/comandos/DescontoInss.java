package br.com.primeiros.comandos;

import java.util.Scanner;

public class DescontoInss {

	public static void main(String[] args) {
		
		String nome, cargo;
		double salario ,resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		nome = sc.next();
		
		System.out.println("Digite o seu cargo");
		cargo = sc.next();
		
		System.out.println("Digite o Salario");
		salario = sc.nextDouble();
		
		if(salario <= 500){
			resultado = salario-(salario*0.02);
			
		}else if(salario <= 1000){
			resultado = salario-(salario*0.053);
		}else if(salario <= 1500){
			resultado = salario-(salario*0.06);
		}else if(salario <= 2000){
			resultado = salario-(salario*0.065);
		} else {
			resultado = salario -(salario*0.07);
		}
		
		System.out.println("Seu Salario de : " + resultado);

	}

}
