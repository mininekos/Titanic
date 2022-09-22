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
		// ordenadarParaSalidda();
		// lleno un array para sacarlo al terminar la zona
		sacarPersonas(TipoZona.PROA);
		// Vacio el arraya en en botes
		llenarBotes(TipoZona.PROA);
		// Repito
		sacarPersonas(TipoZona.ESTRIBOR);
		sacarPersonas(TipoZona.POPA);
		sacarPersonas(TipoZona.BABOR);

	}

	private void llenarBotes(TipoZona zona) {
		
		
	}
	
	private void ordenarBotes() {
		Collections.sort(listaBotes,new Bote());
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

	public String botesToStringOrdenado() {
		ordenarBotes();
		return listaBotes.toString();
	}
}
