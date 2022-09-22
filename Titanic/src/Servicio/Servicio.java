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
import POJO.Tripulacion;
import POJO.Bote;
import POJO.Pasajero;

public class Servicio {

	
	private Map<Bote,ArrayList<Persona>> bote_persona;
	private ArrayList<Bote> listaBotes;
	private ArrayList<Persona> listaPersonas,salidaPersonas;
	
	
	public Servicio() {
		super();
		
		this.listaBotes = DAOBotes.getInstance().getDaoBotes();
		this.listaPersonas = DAOPersonas.getInstance().getDaoPersonas();
		this.salidaPersonas = new ArrayList<Persona>();
	}
	
	
	 public void llenarBote() {
		 
		 //Con Arraylist
		 //ordenadarParaSalidda();

				sacarPersonas(TipoZona.PROA);				
				sacarPersonas(TipoZona.ESTRIBOR);
				sacarPersonas(TipoZona.POPA);		
				sacarPersonas(TipoZona.BABOR);

	 }
	 
	
	
		// ordena pero no tiene en cuenta el criterio
		  private void sacarPersonas(TipoZona zona) {
			for (int ind = 0; ind < listaPersonas.size(); ind++) {
				if(listaPersonas.get(ind).getEdad()<18 && listaPersonas.get(ind).getZona()==zona) {
					salidaPersonas.add(listaPersonas.get(ind));
					listaPersonas.remove(listaPersonas.get(ind));
				}
			}
			
			for (int ind = 0; ind < listaPersonas.size(); ind++) {
				if(listaPersonas.get(ind).getEdad()>=65 && listaPersonas.get(ind).getZona()==zona) {
					salidaPersonas.add(listaPersonas.get(ind));
					listaPersonas.remove(listaPersonas.get(ind));
				}
			}
			
			for (int ind = 0; ind < listaPersonas.size(); ind++) {
				if(listaPersonas.get(ind).getMinusvalia()==true && listaPersonas.get(ind).getZona()==zona) {
					salidaPersonas.add(listaPersonas.get(ind));
					listaPersonas.remove(listaPersonas.get(ind));;
				}
			}
			
			for (int ind = 0; ind < listaPersonas.size(); ind++) {
				if(listaPersonas.get(ind) instanceof Pasajero && listaPersonas.get(ind).getZona()==zona) {
					salidaPersonas.add(listaPersonas.get(ind));
					listaPersonas.remove(listaPersonas.get(ind));
				}
			}
			
			for (int ind = 0; ind < listaPersonas.size(); ind++) {
				if(listaPersonas.get(ind) instanceof Tripulacion && listaPersonas.get(ind).getZona()==zona  ) {
					salidaPersonas.add(listaPersonas.get(ind));
					listaPersonas.remove(listaPersonas.get(ind));
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
	
	public String personasToStringOrdenadaSalida() {
		
		return salidaPersonas.toString();
	}
	public String botesToString() {
		
		return listaBotes.toString();
	}
	
	
}
