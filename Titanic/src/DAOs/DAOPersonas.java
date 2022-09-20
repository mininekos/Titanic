package DAOs;

import java.time.LocalDate;
import java.util.ArrayList;

import Enums.TipoCargo;
import Enums.TipoPais;
import Enums.TipoZona;
import POJO.Pasajero;
import POJO.Persona;
import POJO.Tripulación;

public class DAOPersonas {
	
	private static ArrayList<Persona> lista =null;
	private static DAOPersonas daoPersona=null;
	
	public ArrayList<Persona> getDaoPersonas() {
		if (lista==null)
			return lista;
		else
			return lista;
	}
	
	public ArrayList<Persona> getInstance() {
		if (lista==null)
			return lista;
		else
			return lista;
	}
	
	private DAOPersonas() {
		lista=new ArrayList<Persona>();
		//Familia 1
		lista.add(new Pasajero("145236978B", "Juan", TipoZona.BABOR, TipoPais.ESPANA, LocalDate.of(1975, 3, 8), false, 145));
		lista.add(new Pasajero("145234444A", "Maria", TipoZona.BABOR, TipoPais.ESPANA, LocalDate.of(2015, 6, 2), false, 145));
		lista.add(new Pasajero("145236984G", "Angel", TipoZona.BABOR, TipoPais.ESPANA, LocalDate.of(2002, 10, 7), false, 145));
		lista.add(new Pasajero("145236999C", "Pepa", TipoZona.BABOR, TipoPais.ESPANA, LocalDate.of(1980, 5, 12), false, 145));
		
		//Familia 2
		lista.add(new Pasajero("145255558B", "Luis", TipoZona.POPA, TipoPais.ALEMANIA, LocalDate.of(1965, 3, 8), false, 60));
		lista.add(new Pasajero("145234467A", "Pepe", TipoZona.POPA, TipoPais.ALEMANIA, LocalDate.of(2015, 6, 2), false, 60));
		lista.add(new Pasajero("145236797G", "Ana", TipoZona.POPA, TipoPais.ALEMANIA, LocalDate.of(1998, 10, 7), false, 60));
		lista.add(new Pasajero("145236990C", "Luisa", TipoZona.POPA, TipoPais.ALEMANIA, LocalDate.of(1970, 5, 12), false, 60));
		
		//Sueltos
		lista.add(new Pasajero("152344444A", "Maria", TipoZona.ESTRIBOR, TipoPais.FRANCIA, LocalDate.of(1956, 6, 2), true, 52));
		lista.add(new Pasajero("145236984G", "Angel", TipoZona.ESTRIBOR, TipoPais.FRANCIA, LocalDate.of(1948, 10, 7), false, 34));
		lista.add(new Pasajero("145230000C", "Pepa", TipoZona.ESTRIBOR, TipoPais.FRANCIA, LocalDate.of(1970, 5, 12), true, 15));
		
		//Tripulacion
		lista.add(new Tripulación("987456123C", "Josh", TipoZona.PROA, TipoPais.ITALIA, LocalDate.of(1965, 3, 8), false, TipoCargo.ALTA));
		lista.add(new Tripulación("987456124C", "Rafael", TipoZona.PROA, TipoPais.ITALIA, LocalDate.of(1965, 3, 8), false, TipoCargo.MUY_ALTA));
		lista.add(new Tripulación("987456125C", "Alberti", TipoZona.PROA, TipoPais.ITALIA, LocalDate.of(1965, 3, 8), false, TipoCargo.MEDIA));
		lista.add(new Tripulación("987456126C", "Lola", TipoZona.PROA, TipoPais.ITALIA, LocalDate.of(1965, 3, 8), false, TipoCargo.BAJA));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
