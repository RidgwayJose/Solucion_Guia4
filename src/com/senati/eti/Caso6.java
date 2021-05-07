package com.senati.eti;

public class Caso6 {

	public static void main(String[] args) {
		// Declarar y asignar valores en la Matriz 2x3
		String[][] mDatos = { {"Joe Castillo", "Rosa Alvarez", "Carlos Santana"},
							  {"Callao", "Comas", "San Miguel"} };

		System.out.println("\nIMPRESIÓN DE VALORES POR FILAS");
		System.out.println("------------------------------");
		for(int f = 0; f < mDatos.length; f++) {
			for(int c = 0; c < mDatos[0].length; c++) {
				System.out.print(String.format("%-20s", mDatos[f][c]));
			}
			System.out.println();
		}
	
		System.out.println("\nIMPRESIÓN DE VALORES POR COLUMNAS");
		System.out.println("------------------------------");
		for(int c = 0; c < mDatos[0].length; c++) {
			for(int f = 0; f < mDatos.length; f++) {
				System.out.print(String.format("%-20s", mDatos[f][c]));
			}
			System.out.println();
		}
		
	}

}
