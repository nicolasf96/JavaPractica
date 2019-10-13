package practicaParcial1;

public class Cochera extends Propiedad{
	
	int capacidadVehiculos;
	double importeExtraPorVehiculo;
	
	public int getCapacidadVehiculos() {
		return capacidadVehiculos;
	}
	public void setCapacidadVehiculos(int capacidadVehiculos) {
		this.capacidadVehiculos = capacidadVehiculos;
	}
	public double getImporteExtraPorVehiculo() {
		return importeExtraPorVehiculo;
	}
	public void setImporteExtraPorVehiculo(double importeExtraPorVehiculo) {
		this.importeExtraPorVehiculo = importeExtraPorVehiculo;
	}
	
	@Override
	public double getCostoMensual()
	{
		double total = this.importeBase;
		double adicional = capacidadVehiculos*importeExtraPorVehiculo;
		total= total + adicional;		
		return total;
	}
	

}
