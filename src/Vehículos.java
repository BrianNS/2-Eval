import java.time.LocalDate;

public abstract class Veh�culos {

	private String Matr�cula;
	private String Chasis;
	private String Marca;
	private String Potencia;
	private String DNI;
	private LocalDate FechaM;
	LocalDate itv;
	
	public abstract void itv(String rev);
	
	public Veh�culos(){
		super();
	}
	
	public String getMatr�cula(){
		return Matr�cula;
	}
	
	public void setMatr�cula(String Matr�cula){
		this.Matr�cula = Matr�cula;
	}
	
	public String getChasis(){
		return Chasis;
	}
	
	public void setChasis(String Chasis){
		this.Chasis = Chasis;
	}
	
	public String getMarca(){
		return Marca;
	}
	
	public void setMarac(String marca){
		this.Marca = Marca;
	}
	
	public String getPotencia(){
		return Potencia;
	}
	
	public void setPotencia(String Potencia){
		this.Potencia = Potencia;
	}
	
	public String getDNI(){
		return DNI;
	}
	
	public void setDNI(String DNI){
		this.DNI = DNI;
	}
	
	public LocalDate getFechaM(){
		return FechaM;
	}
	
	public void setFechaM(LocalDate FechaM){
		this.FechaM = FechaM;
	}
	
	public abstract LocalDate itv();
}
