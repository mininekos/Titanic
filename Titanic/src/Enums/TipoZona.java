package Enums;

import java.util.ArrayList;
import java.util.List;

public enum TipoZona {

	PROA(List.of(1,2,3)),POPA(List.of(4,5,6)),BABOR(List.of(7,8,9)),ESTRIBOR(List.of(10,11,12));

	private List<Integer> escalera=new ArrayList<Integer>();
	
	TipoZona(List<Integer> escalera) {
		this.escalera=escalera;
	}

	public List<Integer> getEscalera() {
		return escalera;
	}
	
}
