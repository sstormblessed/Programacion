package arrays_ejercicios;

import java.util.Scanner;

public class Boletin1 {
	/*1. Leer 5 números y mostrarlos en el mismo orden
	introducido */
public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	int [] array = new int[5];
	
	/*pedir numeros*/
	for(int i = 0; i<array.length;i++) {
		System.out.println("introduce el indice "+i);
		array[i]= sc.nextInt();
	}
	
	/*mostrarlos*/
	for(int i = 0; i<array.length;i++) {
		System.out.print(" "+array[i]);
	}
	
	
	
	}
	}