package POJO;

import java.sql.Date;

import Enums.TipoPais;
import Enums.TipoZona;

public class Persona implements Comparable<Persona>{

	
	private String dni, nombre;
	private TipoZona zona;
	private TipoPais pais;
	private Date fechaNacimiento;
	private Boolean minusvalia;
	
	public Persona(String dni, String nombre, TipoZona zona, TipoPais pais, Date fechaNacimiento, Boolean minusvalia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.zona = zona;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.minusvalia = minusvalia;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoZona getZona() {
		return zona;
	}

	public void setZona(TipoZona zona) {
		this.zona = zona;
	}

	public TipoPais getPais() {
		return pais;
	}

	public void setPais(TipoPais pais) {
		this.pais = pais;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Boolean getMinusvalia() {
		return minusvalia;
	}

	public void setMinusvalia(Boolean minusvalia) {
		this.minusvalia = minusvalia;
	}

	@Override
	public String toString() {
		return "Persona --> dni=" + dni + ", nombre=" + nombre + ", zona=" + zona + ", pais=" + pais + ", fechaNacimiento="
				+ fechaNacimiento + ", minusvalia=" + minusvalia ;
	}

	
	@Override
	public int compareTo(Persona p) {
		
		return pais.compareTo(p.getPais());
	}

	
	
	
}
