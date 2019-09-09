package controlador;

import modelo.Mundo;
import vista.Interfaz;
/**
 * @author Gabriel Blanco - Julian Santos
 *
 */
public class Controlador
{
	//Atributos 
	private Mundo mundo;
	private Interfaz gui;
	
	public Controlador()
	{
		//Constructores
		mundo = new Mundo();
		gui = new Interfaz();
		iniciarPrograma();
	}
	
	// Metodo de ejecucion del programa con sentencia try/catch 
	public void iniciarPrograma()
	{
		boolean activo = true;
		while(activo == true)
		{
			try 
			{
				
				int numeroSesion = Integer.parseInt(gui.pedirDato());
				gui.Information(mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+"\n"+mundo.getSeminario().escribirdesdeNombres(mundo.getArchivo().leerDesdenombresTXT(), numeroSesion),numeroSesion));
				gui.Information(mundo.getPropiedades().getPropiedades()+mundo.getPropiedades().setPropiedades(numeroSesion));
				activo = false;
			} 
			catch (Exception e) 
			{
				
				gui.Error("Ingrese numeros, no letras\n"+e.toString());
			}
		}
		
	}
}
