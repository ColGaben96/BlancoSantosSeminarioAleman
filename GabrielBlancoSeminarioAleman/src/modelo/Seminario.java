package modelo;

public class Seminario 
{
	private String[] sesion, rol;
	
	public Seminario()
	{
		sesion = new String[32];
		rol = new String[3];
		rol[0] = "Relator";
		rol[1] = "Contradictor";
		rol[2] = "Protocolante";
	}
	
	public String escribirLista()
	{
		String string = "";
		for (int i = 0; i < sesion.length; i++)
		{
			double rolAleatorio = Math.random()*((2-0)+1)+0;
			int numero = (int) rolAleatorio;
			if(numero < 0)
				numero *= -1;
			sesion[i] = "Sujeto "+i+" > Rol: "+rol[numero]+"\n";
			string += sesion[i];
		}
		return string;
	}
	
	public String capturarSujeto()
	{
		double numRandom = Math.random()*((31-0)+1)+0;
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
		
		return "Se ha seleccionado a "+sesion[numero];
	}
	
	public String escribirdesdeNombres(String pSesion)
	{
		String string = "";
		for (int i = 0; i < sesion.length; i++) 
		{
			double rolAleatorio = Math.random()*((2-0)+1)+0;
			int numero = (int) rolAleatorio;
			if(numero < 0)
				numero *= -1;
			sesion[i] = pSesion+" > Rol: "+rol[numero]+"\n";
			string += sesion[i];
		}
		
		return string;
		
	}

	public String[] getSesion() {
		return sesion;
	}
	
	public void setSesion(String[] sesion) {
		this.sesion = sesion;
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
