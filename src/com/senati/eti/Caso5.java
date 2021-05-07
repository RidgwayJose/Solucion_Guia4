package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr_codigo = {"A-123", "A-456", "A-789", "A-159"};
		String [] arr_nombre = {"Joe Castillo", "Rosa Flores", "Carlos Benavides", "Sara Montes"};
		int [] arr_nota = {13, 8, 18, 10, 5};
		String estado = "";
		
		String codigo = "";
		
		System.out.println("\n------------------------------.-------");
		System.out.println("COLEGIO SENATI - MODULO DE BÚSQUEDAS");
		System.out.println("------------------------------------");
	
		System.out.print("Código a buscar: ");
		codigo = sc.nextLine();
		
		//Realizar la búsqueda del código en el arreglo arr_codigo
		int posicion = -1;
		
		for (int i = 0; i < arr_codigo.length; i++) {
			if (arr_codigo[i].equals(codigo)) {
				posicion = i;
				if(arr_nota[i] >= 11)
					estado = "Aprobado";
				else
					estado = "Desaprobado";
				break;
			}
		}
		
		System.out.println("\nResultados");
		System.out.println("------------------------------------");
		
		
		if (posicion == -1) {
			//Código no se encontró
			System.out.println("\nCódigo no encontrado");
		} else {
			System.out.println("Datos del Participante");
			System.out.println("----------------------");
			System.out.println("Código....: " + arr_codigo[posicion]);
			System.out.println("Nombre....: " + arr_nombre[posicion]);
			System.out.println("Nota......: " + arr_nota[posicion]);
			System.out.println("Estado....: " + estado);
			//Muestre un estado: Aprobado o Desaprobado
		
		}
	}

}
