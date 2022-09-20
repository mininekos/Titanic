package POJO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.Objects;

import Enums.TipoPais;
import Enums.TipoZona;

public class Persona implements Comparator<Persona>{

	
	private String dni, nombre;
	private TipoZona zona;
	private TipoPais pais;
	private LocalDate fechaNacimiento;
	private Boolean minusvalia;
	private int edad;
	
	public Persona(String dni, String nombre, TipoZona zona, TipoPais pais, LocalDate fechaNacimiento, Boolean minusvalia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.zona = zona;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.minusvalia = minusvalia;
		this.edad=getEdad();
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public int getEdad() {
		return Period.between(fechaNacimiento, LocalDate.now()).getYears();
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
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
		return "\nPersona --> dni= " + dni + ", nombre= " + nombre + ", zona= " + zona + ", pais= " + pais + ", fechaNacimiento= "
				+ fechaNacimiento + ", minusvalia= " + minusvalia + ", edad= "+edad ;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, pais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && pais == other.pais;
	}

	@Override
	public int compare(Persona p1, Persona p2) {
		
		if( p1.pais.compareTo(p2.getPais())!=0) {
			return p1.pais.compareTo(p2.getPais());
		}
		else {
			return p1.nombre.compareTo(p2.getNombre());
		}
	}

	
	
	
}
