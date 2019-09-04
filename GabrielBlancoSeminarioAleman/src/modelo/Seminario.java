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
		String string = "";
		for (int i = 0; i < sesion.length; i++)
		{
			sesion[i] = "Sujeto "+i+"\n";
			string += sesion[i];
		}
		return string;
	}
	
	public String capturarSujeto()
	{
		double numRandom = Math.random()*10;
		int numero = (int) numRandom;
		if(numero < 0)
		{
			numero *= -1;
		}
		for (int i = 0; i < sesion.length; i++) 
		{
			try 
			{
				return "Se eligió a "+sesion[numero];
			} 
			catch (Exception e) 
			{
				// No hace nada porque ya se sabe que la excepcion es gracias a un index fuera del limite.
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
				cantidadCupo++;
			}
		}
		
		return "Cantidad de cupo: "+cantidadCupo;
	}

}
