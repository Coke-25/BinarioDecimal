package es.studium.BinarioDecimal;

import java.util.Scanner;

public class BinarioDecimal 
{

	public static void main(String[] args) 
	{
		int a,b,c,d,e;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero:");
		a = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		b = teclado.nextInt();
		System.out.println("Dame otro n�mero m�s:");
		c = teclado.nextInt();
		System.out.println("Otro:");
		d = teclado.nextInt();
		System.out.println("Y el �ltimo:");
		e = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la conversi�n es: " + funconver(a,b,c,d,e));
		
	}
	public static int funconver(int a, int b, int c, int d, int e)
	{
		return ((a*16)+(b*8)+(c*4)+(d*2)+(e));
	}

}
