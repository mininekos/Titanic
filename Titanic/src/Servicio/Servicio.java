package Servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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

	private Map<Bote, ArrayList<Persona>> botePersona;
	private ArrayList<Bote> listaBotes;
	private ArrayList<Persona> listaPersonas, salidaPersonas;

	public Servicio() {
		super();
		botePersona= new HashMap<Bote, ArrayList<Persona>>();
		this.listaBotes = DAOBotes.getInstance().getDaoBotes();
		this.listaPersonas = DAOPersonas.getInstance().getDaoPersonas();
		this.salidaPersonas = new ArrayList<Persona>();
	}

	public void vaciarBarco() {

		// Con Arraylist
		//Ordeno primero(por las condiciones puedo no hacerlo)
		ordenadarParaSalidda();
		
		// lleno un array para sacarlo al terminar la zona
		sacarPersonas(TipoZona.PROA);
		sacarPersonas(TipoZona.ESTRIBOR);
		sacarPersonas(TipoZona.POPA);
		sacarPersonas(TipoZona.BABOR);
		llenarBotes();

	}

	private void llenarBotes() { 	
			
			if(botePersona.isEmpty()) {
				for (Bote bote : listaBotes) {
					botePersona.put(bote, new ArrayList<Persona>());
				}
				
			}
			//Funciona
			for (Map.Entry<Bote, ArrayList<Persona>> entry : botePersona.entrySet()) {
				Bote key = entry.getKey();
				ArrayList<Persona> val = entry.getValue();
				for(int ind=0;val.size()<key.getNumPlazas() && salidaPersonas.size()>0;ind++) {	
					//if(val.get(ind).getZona()==key.getZona())
					addToList(key, salidaPersonas.remove(0));	
				}
				//System.out.println(key.toString()+val.toString());
			} 
			System.out.println(botePersona.toString());
	}
	
	public synchronized void addToList(Bote mapKey, Persona persona) {
		ArrayList<Persona> itemsList = botePersona.get(mapKey);

	    // creo la lista
	    if(itemsList == null) {
	         itemsList = new ArrayList<Persona>();
	         itemsList.add(persona);
	         botePersona.put(mapKey, itemsList);
	    } else {
	        // agrego el item
	        if(!itemsList.contains(persona)) itemsList.add(persona);
	    }
	}

	// Ordena listaPersona de forma que las pueda sacar
	private void sacarPersonas(TipoZona zona) {
		for (int ind = 0; ind < listaPersonas.size(); ind++) {
			if (listaPersonas.get(ind).getEdad() < 18 && listaPersonas.get(ind).getZona() == zona) {
				salidaPersonas.add(listaPersonas.get(ind));
				listaPersonas.remove(listaPersonas.get(ind));
				ind--;
			}
		}

		for (int ind = 0; ind < listaPersonas.size(); ind++) {
			if (listaPersonas.get(ind).getEdad() >= 65 && listaPersonas.get(ind).getZona() == zona) {
				salidaPersonas.add(listaPersonas.get(ind));
				listaPersonas.remove(listaPersonas.get(ind));
				ind--;
			}
		}

		for (int ind = 0; ind < listaPersonas.size(); ind++) {
			if (listaPersonas.get(ind).getMinusvalia() == true && listaPersonas.get(ind).getZona() == zona) {
				salidaPersonas.add(listaPersonas.get(ind));
				listaPersonas.remove(listaPersonas.get(ind));
				;
			}
		}

		for (int ind = 0; ind < listaPersonas.size(); ind++) {
			if (listaPersonas.get(ind) instanceof Pasajero && listaPersonas.get(ind).getZona() == zona) {
				salidaPersonas.add(listaPersonas.get(ind));
				listaPersonas.remove(listaPersonas.get(ind));
				ind--;
			}
		}

		for (int ind = 0; ind < listaPersonas.size(); ind++) {
			if (listaPersonas.get(ind) instanceof Tripulacion && listaPersonas.get(ind).getZona() == zona) {
				salidaPersonas.add(listaPersonas.get(ind));
				listaPersonas.remove(listaPersonas.get(ind));
				ind--;
			}
		}

	}

	private void ordenadarParaSalidda() {
		Collections.sort(listaPersonas, new ComparadorSalida());

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