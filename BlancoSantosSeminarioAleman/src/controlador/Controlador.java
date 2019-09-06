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
		try 
		{
			
			int numeroSujeto = Integer.parseInt(gui.pedirDato());
			gui.Information(mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+"\n"+mundo.getSeminario().escribirdesdeNombres(mundo.getArchivo().leerDesdenombresTXT(), mundo.getArchivo().getNumeroSesion())));
			mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+mundo.getSeminario().capturarSujeto(numeroSujeto));
			mundo.getArchivo().setNumeroSesion(mundo.getArchivo().getNumeroSesion()+1);	
		} catch (Exception e) {
			
			gui.Error("Ingrese numeros , no letras");
		}
		
	}
}
