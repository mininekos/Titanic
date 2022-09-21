package main;

import Servicio.Servicio;

public class Test {

	public static void main(String[] args) {

		Servicio servicio = new Servicio();
		
		
		//System.out.println(servicio.botesToString());
		//System.out.println(servicio.personasToString());
		System.out.println(servicio.personasToStringOrdenada());
	}

}
