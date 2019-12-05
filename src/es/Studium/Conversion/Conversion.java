package es.Studium.Conversion;

import java.util.Scanner;

public class Conversion 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char menu;
		double temperatura;
		Scanner teclado = new Scanner(System.in);
		do //Muestra el menu y lo repire
	        {
			System.out.println( "Menu");
			System.out.println( "1- Pasar de Centígrado a Fahrenheit");
			System.out.println( "2- Pasar de Fahrenheit a Centígrado");
			System.out.println( "3- Salir");
			System.out.println( "Introduzca una opcion del 1-3");
			
			menu = teclado.next().charAt(0);
       
			switch (menu)
				{
					case '1':
						System.out.println( "Introduzca los centigrados");
						temperatura = teclado.nextDouble();
						System.out.println(temperatura+" Grados equivalen a "+(9.0/5.0*(temperatura+32.0))+" Fahrenheit");
						break;
					case '2':
						System.out.println( "Introduzca los Fahrenheit");
						temperatura = teclado.nextDouble();
						System.out.println(temperatura+" Fahrenheit equivalen a "+(5.0/9.0*(temperatura-32.0))+" Grados");
						break;
					case '3':
						System.out.println("Saliendo del programa");
						break;
		
					default:
						System.out.println("La opcion elejida no es correcta");
				}
	        }
		while(menu != '3');// pone la condicion para dejar de mostrar el menu
		teclado.close();
	}

}
