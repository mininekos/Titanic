package POJO;

public class Bote {

	private static Integer id=0;
	private Integer numPlazas;
	
	public Bote(Integer numPlazas) {
		super();
		this.numPlazas = numPlazas;
		
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

	

	@Override
	public String toString() {
		return "Bote --> numPlazas=" + numPlazas;
	}
	
	
	
	
}
