package es.studium.BinarioDecimal;

import java.util.Scanner;

public class BinarioDecimal 
{

	public static void main(String[] args) 
	{
		int a,b,c,d,e;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número:");
		a = teclado.nextInt();
		System.out.println("Dame otro número:");
		b = teclado.nextInt();
		System.out.println("Dame otro número más:");
		c = teclado.nextInt();
		System.out.println("Otro:");
		d = teclado.nextInt();
		System.out.println("Y el último:");
		e = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la conversión es: " + funconver(a,b,c,d,e));
		
	}
	public static int funconver(int a, int b, int c, int d, int e)
	{
		return ((a*16)+(b*8)+(c*4)+(d*2)+(e));
	}

}
