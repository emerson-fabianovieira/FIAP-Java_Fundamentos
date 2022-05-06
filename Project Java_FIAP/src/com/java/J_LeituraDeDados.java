package com.java;

import java.util.Scanner;

public class J_LeituraDeDados {

	public static void main(String[] args) {

		int idade = 18;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
				
		System.out.println("Digite a idade:");
		idade = sc.nextInt();
		
		if (idade < 0)
			System.out.println("Idade Inválida!");

		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70){
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("Centenario");
			}
		} else if (idade >= 0) {
			System.out.println("Menor idade");
		}

	}

}
