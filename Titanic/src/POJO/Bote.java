package POJO;


import java.util.Comparator;

import Enums.TipoZona;

public class Bote implements Comparator<Bote>{

	private static Integer id=0;
	private Integer numPlazas;
	private TipoZona zona;
	
	public Bote(Integer numPlazas,TipoZona zona) {
		super();
		this.numPlazas = numPlazas;
		this.zona = zona;
		
		id++;
	}
	public Bote() {
		
	}
	
	public static Integer getId() {
		return id;
	}

	public static void setId(Integer id) {
		Bote.id = id;
	}

	public Integer getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}

	public TipoZona getZona() {
		return zona;
	}

	public void setZona(TipoZona zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "\nBote --> numPlazas= " + numPlazas+ " Zona= " + zona;
	}
	@Override
	public int compare(Bote bote1, Bote bote2) {
		return bote1.getZona().compareTo(bote2.getZona());
			
	}
	
	
	
	
	
}
