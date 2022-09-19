package DAOs;

import java.util.ArrayList;

import Enums.TipoZona;
import POJO.Pasajero;
import POJO.Persona;
import POJO.Tripulación;

public class DAOPersonas {
	
	private static ArrayList<Persona> DaoPersonas;
	
	public ArrayList<Persona> getDaoPersonas() {
		if (DaoPersonas==null)
			return DaoPersonas;
		else
			return DaoPersonas;
	}
	
	private DAOPersonas() {
		DaoPersonas=new ArrayList<Persona>();
		
		DaoPersonas.add(new Pasajero("145236978B", "Juan", TipoZona.BABOR, null, null, null, null));
		DaoPersonas.add(new Pasajero(null, null, null, null, null, null, null));
		
		DaoPersonas.add(new Tripulación(null, null, null, null, null, null, null));
		DaoPersonas.add(new Tripulación(null, null, null, null, null, null, null));
	}
	
}
