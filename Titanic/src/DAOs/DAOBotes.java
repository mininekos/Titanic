package DAOs;

import java.util.ArrayList;

import Enums.TipoZona;
import POJO.Bote;

public class DAOBotes {

	private static ArrayList<Bote> lista=null;
	private static DAOBotes daoBotes=null;
	
	public ArrayList<Bote> getDaoBotes(){
		
		return lista;
	}
		
	public ArrayList<Bote> instanceDaoBotes(){
		
		return lista;
	}
	
	private DAOBotes() {
		lista= new ArrayList<Bote>();
		
		lista.add(new Bote(10, TipoZona.PROA));
		
		lista.add(new Bote(2, TipoZona.BABOR));
		
		lista.add(new Bote(4, TipoZona.ESTRIBOR));
		
		lista.add(new Bote(6, TipoZona.POPA));
	}
	
	
}
