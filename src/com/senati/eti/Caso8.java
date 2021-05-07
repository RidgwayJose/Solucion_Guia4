package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr_nombre = new ArrayList<String>();
		ArrayList<Integer> arr_edad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;
		
		while (rp.equals("S") || rp.equals("s")) {
			nr++;
			System.out.println("REGISTRO N." + nr);
			System.out.println("------------");
			
			System.out.print("Nombre....: ");
			nombre = sc.nextLine();
			System.out.print("Edad......: ");
			edad = sc.nextInt();
			
			//Agregar valores leídos a cada ArraysList
			arr_nombre.add(nombre);
			arr_edad.add(edad);
			
			sc.nextLine();
			
			System.out.print("¿Continua) [S|N]: ");
			rp = sc.nextLine();
		}
	}

}
