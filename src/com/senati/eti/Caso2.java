package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arrNumero = new int[5];
		
		System.out.println("REGISTRO DE N�MEROS");
		System.out.println("-------------------");
		
		int num_mayor = 0, num_menor = 0, suma = 0;
		
		for(int x = 0; x < arrNumero.length; x++) {
			System.out.println("N�mero " + (x + 1) + ": ");
			arrNumero[x] = sc.nextInt();
			if (x==0) {
				num_mayor = arrNumero[0];
				num_menor = arrNumero[0];
		}
			else {
				if (arrNumero[x] > num_mayor) num_menor = arrNumero[x];
				if (arrNumero[x] < num_menor) num_menor = arrNumero[x];
		}
		
			suma += arrNumero[x];
		}
		
		
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("N�mero mayor.....: " + num_mayor);
		System.out.println("N�mero menor.....: " + num_menor);
		System.out.println("Sumatoria........: " + suma);
		System.out.println(Arrays.toString(arrNumero));
	}

}
