package Comparador;

import java.util.Comparator;

import POJO.Pasajero;
import POJO.Persona;
import POJO.Tripulacion;

public class ComparadorSalida implements Comparator<Persona>{

	@Override
	public int compare(Persona persona1, Persona persona2) {
		if( persona1.getZona().compareTo(persona2.getZona())!=0) {
			return persona1.getZona().compareTo(persona2.getZona());
			}
		else if ( persona1 instanceof Pasajero && persona2 instanceof Pasajero)
			return persona1.getEdad()-persona2.getEdad();
			else if(persona1 instanceof Tripulacion && persona1 instanceof Tripulacion) {
				Tripulacion trip1=(Tripulacion) persona1,trip2=(Tripulacion) persona2;
				return trip1.getCargo().compareTo(trip2.getCargo());
			}
			else 
				return -1;
		 
			
	}

}
