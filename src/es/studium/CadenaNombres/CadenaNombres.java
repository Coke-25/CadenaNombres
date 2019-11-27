package es.studium.CadenaNombres;

import java.util.Scanner;

public class CadenaNombres 
{

	public static void main(String[] args) 
	{
		String a;
		String b = "";
		String c = new String();
		String d = new String("");
		String e;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame la cadena");
		a = teclado.next();
		System.out.println("Dame otra cadena");
		b = teclado.next();
		System.out.println("otra cadena");
		c = teclado.next();
		System.out.println("Otra cadena más");
		d = teclado.next();
		System.out.println("La última");
		e = teclado.next();
		
		
		System.out.println(String.format("Las cadenas son '%s', '%s', '%s', '%s' y \"%s\"", a, b ,c , d, e));
		
		teclado.close();
	}

}
