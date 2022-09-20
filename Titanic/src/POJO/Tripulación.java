package POJO;


import java.time.LocalDate;

import Enums.TipoCargo;
import Enums.TipoPais;
import Enums.TipoZona;

public class Tripulación extends Persona{
	
	private TipoCargo cargo;

	public Tripulación(String dni, String nombre, TipoZona zona, TipoPais pais, LocalDate fechaNacimiento,
			Boolean minusvalia, TipoCargo cargo) {
		super(dni, nombre, zona, pais, fechaNacimiento, minusvalia);
		this.cargo = cargo;
	}

	public TipoCargo getCargo() {
		return cargo;
	}

	public void setCargo(TipoCargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return super.toString()+" Tripulación [cargo=" + cargo + "]";
	}
	
	
	
}
