package modelo;

public class Seminario 
{
	private double a = Math.random();
	private String[] sesion;
	
	public Seminario()
	{
		sesion = new String[30];
		for (int i = 0; i < sesion.length; i++) 
		{
			sesion[i] = "Sujeto "+i;
		}
	}
	
	public String capturarSujeto()
	{
		for (int i = 0; i < sesion.length; i++) 
		{
			try 
			{
				sesion[(int) a] += " He sido seleccionado";
			} 
			catch (Exception e) 
			{
				
			}
		}
		
		return "Se ha seleccionado al sujeto";
	}
}
