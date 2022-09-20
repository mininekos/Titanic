package Servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import DAOs.DAOBotes;
import DAOs.DAOPersonas;
import Enums.TipoZona;
import POJO.Persona;
import POJO.Bote;

public class Servicio {

	
	private Map<Bote,ArrayList<Persona>> bote_persona;
	private ArrayList<Persona> listaPersonas;
	private ArrayList<Bote> listaBotes;
	
	public Servicio() {
		super();
		
		this.listaPersonas = DAOPersonas.getInstance().getDaoPersonas();
		this.listaBotes = DAOBotes.getInstance().getDaoBotes();
	}
	
	
	 public void llenarBote() {
		 for (int ind = 0; ind < listaPersonas.size(); ind++) {
			if(listaPersonas.get(ind).getZona()==TipoZona.PROA) {
				
			}
			else if((listaPersonas.get(ind).getZona()==TipoZona.ESTRIBOR)) {
				
			}
			else if((listaPersonas.get(ind).getZona()==TipoZona.POPA)) {
				
			}
			else if((listaPersonas.get(ind).getZona()==TipoZona.BABOR)) {
				
			}
		}
		 		
	 }
	
	private int comprobobarEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String personasToString() {
		
		return listaPersonas.toString();
	}
	
	public String botesToString() {
		
		return listaBotes.toString();
	}
	
	
}
