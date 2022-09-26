package DAOs;

import java.util.ArrayList;
import java.util.Collections;

import Enums.TipoZona;
import POJO.Bote;

public class DAOBotes {


	private static DAOBotes daoBotes=null;
	
	private DAOBotes() {
		
	}
		
	public static DAOBotes getInstance(){
		if(daoBotes==null)
			daoBotes=new DAOBotes();
		return daoBotes;
	}
	
	public ArrayList<Bote> getDaoBotes() {
		ArrayList<Bote> lista= new ArrayList<Bote>();
		
		lista.add(new Bote(10, TipoZona.PROA));
		
		lista.add(new Bote(2, TipoZona.BABOR));
		
		lista.add(new Bote(4, TipoZona.ESTRIBOR));
		
		lista.add(new Bote(6, TipoZona.POPA));
		Collections.sort(lista,new Bote());
		return lista;
	}
	
	
}
