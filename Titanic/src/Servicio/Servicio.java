package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import Comparador.ComparadorSalida;
import DAOs.DAOBotes;
import DAOs.DAOPersonas;
import Enums.TipoZona;
import POJO.Persona;
import POJO.Bote;
import POJO.Pasajero;

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
		 
		 //Con Arraylist
		 ordenadarParaSalidda();
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
	 
	
	
	private void ordenadarParaSalidda() {
		Collections.sort(listaPersonas,new ComparadorSalida());
		
	}


	private int comprobobarEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String personasToString() {
		
		return listaPersonas.toString();
	}
	
	public String personasToStringOrdenada() {
		ordenadarParaSalidda();
		return listaPersonas.toString();
	}
	
	public String botesToString() {
		
		return listaBotes.toString();
	}
	
	
}
