package POJO;

import Enums.TipoZona;

public class Bote {

	private static Integer id=0;
	private Integer numPlazas;
	private TipoZona zona;
	
	public Bote(Integer numPlazas,TipoZona zona) {
		super();
		this.numPlazas = numPlazas;
		this.zona = zona;
		
		id++;
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
		return "\nBote --> numPlazas= " + numPlazas+ "Zona= " + zona;
	}
	
	
	
	
}
