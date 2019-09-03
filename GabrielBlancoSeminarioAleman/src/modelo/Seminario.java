package modelo;

public class Seminario 
{
	private String[] sesion;
	
	public Seminario()
	{
		sesion = new String[30];
	}
	
	public String escribirLista()
	{
		String lol = "";
		for (int i = 0; i < sesion.length; i++)
		{
			sesion[i] += "Sujeto "+i+"\n";
			lol = sesion[i];
		}
		return lol;
	}
	
	public String capturarSujeto()
	{
		int a = (int) Math.random();
		for (int i = 0; i < sesion.length; i++) 
		{
			try 
			{
			     sesion[a] += " He sido seleccionado";
			} 
			catch (Exception e) 
			{
				
			}
		}
		
		return "Se ha seleccionado al sujeto";
	}

	public String[] getSesion() {
		return sesion;
	}

	public void verificarCupo() 
	{
		
	}
}
