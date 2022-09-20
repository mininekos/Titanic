package Servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import DAOs.DAOBotes;
import DAOs.DAOPersonas;
import POJO.Persona;
import POJO.Bote;

public class Servicio {

	private Map<Persona,Persona> personas ;

	private ArrayList<Persona> listaPersonas;
	private ArrayList<Bote> listaBotes;
	
	public Servicio() {
		super();
		//this.personas = new HashMap<Persona,Persona>();
		;
		this.listaPersonas = DAOPersonas.getInstance().getDaoPersonas();
		this.listaBotes = DAOBotes.getInstance().getDaoBotes();
	}
	
	public String personasToString() {
		
		return listaPersonas.toString();
	}
	
	public String botesToString() {
		
		return listaBotes.toString();
	}
	
	
}
