package herenciaAyB;


public class B extends A {
	
	public B() 
	{
	this.setNro(5);
	}
	
	public Integer getNro() 
	{
	return super.getNro()+1000;
	}
	
	public String getTexto() 
	{
	return super.getTexto()+this.getNro().toString();
	}
	
}
