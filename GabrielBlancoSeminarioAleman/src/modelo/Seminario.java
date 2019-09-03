package modelo;

public class Seminario 
{
	private String[] sesion;
	private double numRandom = Math.random()*10;
	
	public Seminario()
	{
		sesion = new String[30];
	}
	
	public String escribirLista()
	{
		String string = "";
		for (int i = 0; i < sesion.length; i++)
		{
			sesion[i] += "Sujeto "+i+"\n";
			string += sesion[i];
		}
		return string;
	}
	
	public String capturarSujeto()
	{
		int numero = (int) numRandom;
		for (int i = 0; i < sesion.length; i++) 
		{
			try 
			{
			     return "Se eligió a "+sesion[numero];
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


	public String verificarCupo() 
	{
		int cantidadCupo = 0;
		for (int i = 0; i < sesion.length; i++) 
		{
			if(sesion[i] == null)
			{
				i = cantidadCupo+30;
			}
		}
		
		return "Cantidad de cupo: "+cantidadCupo;
	}

}
