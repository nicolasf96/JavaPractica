package practicaParcial1;

public class DomicilioParticular extends Propiedad{
	
	boolean usoComercialPermitido;
	int habitaciones;
	
	public boolean isUsoComercialPermitido() {
		return usoComercialPermitido;
	}
	public void setUsoComercialPermitido(boolean usoComercialPermitido) {
		this.usoComercialPermitido = usoComercialPermitido;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	@Override
	public double getCostoMensual() 
	{
		double total = this.importeBase;
		for(int i=0;i<habitaciones;i++) 
		{
			double adicional;
			adicional = (this.importeBase*0.05);
			total = total + adicional;
		}
		return total;
	}

}
