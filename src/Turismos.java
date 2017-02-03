import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract  class Turismos extends Veh�culos {

	private String N�puertas;
	private String remolqueOcarga;
	private String N�plazas;
	LocalDate itv;
	
	
	public Turismos(){
		super();
	}
	
	public String getN�puertas(){
		return N�puertas;
	}
	
	public void setN�puertas(String N�puertas){
		this.N�puertas = N�puertas;
	}
	
	public String getremolqueOcarga(){
		return remolqueOcarga;
	}
	
	public void setremolqueOcarga(String remolqueOcarga){
		this.remolqueOcarga = remolqueOcarga;
	}
	
	public String getN�plazas(){
		return N�plazas;
	}
	
	public void setN�plazas(String N�plazas){
		this.N�plazas = N�plazas;
	}
	
	public LocalDate itv(){
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(super.getFechaM(), hoy);
		
		itv = LocalDate.parse(super.getFechaM(), formato);
		itv = itv.plusYears(5);
		return itv;
	}
}
