package br.senai.sp.jandira;

import java.util.Scanner;

public class gastocombustível {

	public static void main(String[] args) {
	
		 Scanner teclado = new Scanner(System.in);


	        System.out.println("-----------------------------------------");
	        System.out.println("         CONSUMO DE COMBUSTÍVEL         ");
	        System.out.println("-----------------------------------------");

	        System.out.print("Modelo do carro? ");
	        String modelo = teclado.nextLine();

	        System.out.print("Autonomia do carro (Km/l)? ");
	        double autonomia = teclado.nextDouble();

	        System.out.print("Distância da viagem (Km)? ");
	        double distancia = teclado.nextDouble();

	        System.out.print("Preço do combustível? ");
	        double precoCombustivel = teclado.nextDouble();
	        
	     double quantidadeCombustivel = distancia / autonomia;
	        double valorTotal = quantidadeCombustivel * precoCombustivel;
	        
	        System.out.println("-----------------------------------------");
	        System.out.println("        R E S U L T A D O       ");
	        System.out.println("-----------------------------------------");
	        System.out.println("modelo do veículo: " + modelo);
	        System.out.println("autonomia do veículo: "+ autonomia + " Km/l");
	        System.out.println("Distância percorrida: " + distancia + " Km");
	        System.out.println("Valor do combustível: R$ " + precoCombustivel);
	        System.out.printf("Quantidade de combustível utilizado: %.2f " , quantidadeCombustivel , " l");
	        System.out.println("");
	        System.out.printf("Total gasto com a viagem: R$ %.2f " , valorTotal);
	        System.out.println(" ");
	        System.out.println("-----------------------------------------");
	  


	}

}
