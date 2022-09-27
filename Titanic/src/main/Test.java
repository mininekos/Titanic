package main;

import Servicio.Servicio;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Servicio servicio = new Servicio();
		
		//Prueba DAOS
		//System.out.println(servicio.botesToString());
		//System.out.println(servicio.personasToString());
		
		//Prueba ordenacion
		//System.out.println(servicio.personasToStringOrdenada());
		
		//servicio.vaciarBarco();
		//System.out.println(servicio.personasToStringOrdenadaSalida());
		//System.out.println(servicio.personasToStringOrdenada());
		//System.out.println(servicio.botesToStringOrdenado());
		servicio.vaciarBarco();
		
		
		
	}

}
