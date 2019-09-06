package modelo;

/**
 * @author Gabriel Blanco - Julian Santos
 *
 */
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
	
	/**
	 *  Metodo que asigna un sujeto con un rol completamente aleatorio , utilizando la funcion Math.random donde este da un numero aleatorio 
	 * @return
	 */
	
	public String escribirLista()
	{
		String string = "";
		for (int i = 0; i < sesion.length-2; i++)
		{
			double rolAleatorio = Math.random()*((2-0)+1)+0;
			int numero = (int) rolAleatorio;
			if(numero < 0)
				numero *= -1;
			sesion[i] = "Sujeto "+(i+1)+" > Rol: "+rol[numero]+"\n";
			string += sesion[i];
		}
		return string;
	}
	
	/**
	 *  Metodo que muestra el sujeto con su rol en el archivo  se utiliza la funcion Math.random donde este da un numero aleatorio para dar el rol 
	 * @return
	 */
	
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
	
	/**
	 * Método que captura los nombres del archivo.txt y los ingresa bajo parámetro en un String[]. Luego, este debe mediante un for, organizar las 32 personas en grupos equitativos.
	 * Al final, retorna un String con los nombres y roles asignados.
	 * @return
	 * @param pSesion
	 */
	public String escribirdesdeNombres(String pSesion)
	{
		String string = "";
		String[] chain = pSesion.split("\n");
		int grupo = 1;
		int cantidadFinal = 0;
		string += "\nGrupo "+grupo+"\n";
		for (int i = 0; i < sesion.length/2; i++) 
		{
			double rolAleatorio = Math.random()*((2-0)+1)+0;
			int numero = (int) rolAleatorio;
			if(numero < 0)
				numero *= -1;
			sesion[i] = chain[i]+" > Rol: "+rol[numero]+"\n";
			string += sesion[i];
			cantidadFinal++;
		}
		grupo++;
		string += "\nGrupo "+grupo+"\n";
		for (int i = cantidadFinal; i < sesion.length; i++) 
		{
			double rolAleatorio = Math.random()*((2-0)+1)+0;
			int numero = (int) rolAleatorio;
			if(numero < 0)
				numero *= -1;
			sesion[i] = chain[i]+" > Rol: "+rol[numero]+"\n";
			string += sesion[i];
			cantidadFinal++;
		}
		
		return string;
		
	}
	
	/**
	 *  Getter y Setter de la Sesion
	 * @return
	 */

	public String[] getSesion() {
		return sesion;
	}
	
	public void setSesion(String[] sesion) {
		this.sesion = sesion;
	}

	/**
	 *  Metodo que muestra el cupo en cada sesion
	 * @return
	 */
	
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
