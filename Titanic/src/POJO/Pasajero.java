package POJO;



import java.time.LocalDate;

import Enums.TipoPais;
import Enums.TipoZona;

public class Pasajero extends Persona{

	private Integer numHabitacion;

	public Pasajero(String dni, String nombre, TipoZona zona, TipoPais pais, LocalDate fechaNacimiento, Boolean minusvalia,
			Integer numHabitacion) {
		super(dni, nombre, zona, pais, fechaNacimiento, minusvalia);
		this.numHabitacion = numHabitacion;
	}

	public Integer getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(Integer numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	@Override
	public String toString() {
		return super.toString()+" Pasajero --> numHabitacion=" + numHabitacion;
	}

	
	
	

}
