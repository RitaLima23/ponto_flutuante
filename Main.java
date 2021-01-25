package ponto_flutuante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A;
		double B;
		double C;
		double area_triangulo;
		double area_circulo;
		double area_trapezio;
		double area_quadrado;
		double area_retangulo;
		double pi = 3.14159;
		double raioC;
		double trapezio1;
		
		System.out.println("Insira o Primeiro Valor:");
		A = sc.nextDouble();
		System.out.println("Insira o Segundo Valor:");
		B = sc.nextDouble();
		System.out.println("Insira o Terceiro Valor:");
		C = sc.nextDouble();
		
		raioC = Math.pow(C, 2.0);
		trapezio1 = (A+B)/2;
		area_quadrado = B * B;
		area_circulo = pi * raioC;
		area_triangulo = A * C / 2;
		area_trapezio = trapezio1*C;
		area_retangulo = A * B;
		
		System.out.println("\n----------------CÁLCULO DE ÁREA----------------");
		System.out.printf("TRIANGULO: %.3f%n", area_triangulo);
		System.out.printf("CIRCULO: %.3f%n", area_circulo);
		System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
		System.out.printf("QUADRADO: %.3f%n", area_quadrado);
		System.out.printf("RETANGULO: %.3f%n", area_retangulo);
		System.out.println("----------------FIM----------------");
		
		sc.close();
		
		
	}
		

}
