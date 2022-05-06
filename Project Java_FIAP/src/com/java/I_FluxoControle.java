package com.java;

public class I_FluxoControle {

	public static void main(String[] args) {

		int idade = 10;

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
