package practicaParcial1;

public class Oficina extends Propiedad{
	
	boolean pisoTecnico;
	Servicio[] servicios;
	
	
	
	public boolean isPisoTecnico() {
		return pisoTecnico;
	}

	public void setPisoTecnico(boolean pisoTecnico) {
		this.pisoTecnico = pisoTecnico;
	}

	public Servicio[] getServicios() {
		return servicios;
	}

	public void setServicios(Servicio[] servicios) {
		this.servicios = servicios;
	}

	@Override
	public double getCostoMensual() 
	{
		double total = this.importeBase;
		for(Servicio serv: servicios) {
			double costoServ;
			costoServ = serv.getCostoMensual();
			total = total+costoServ;
		}
		
		return total;
	}

}
