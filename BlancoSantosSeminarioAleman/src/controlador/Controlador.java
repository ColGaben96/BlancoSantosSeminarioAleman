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
	private String comando;
	
	public Controlador()
	{
		//Constructores
		mundo = new Mundo();
		gui = new Interfaz();
		comando = new String();
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
				comando = gui.AppInput(System.in, "Ingresa un comando", "Gabriel Blanco; Julian Santos - Seminario Aleman"); // Ventana Inicial con Titulo y Campo de texto para el comando
				switch(comando)
				{
				default:
					gui.Error(comando+" no es valido. Escribe \"ayuda\" para mas informacion.");
					break;
				case("ayuda"):
					gui.Information("\"seminario\" para mostrar el seminario\n\"verificacion\" Verifica la cantidad de cupo\n\"salir\" salir");// muestra el funcionamiento del programa
					break;
				case("salir"):
					activo = false;
					break;
				case("verificacion"):
					gui.WarningMessage(mundo.getSeminario().verificarCupo());// muestra el cupo disponible
					break;
				case("seminario"):
					gui.Information(mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+"\n"+mundo.getSeminario().escribirLista()));
					mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+mundo.getSeminario().capturarSujeto());
					mundo.getArchivo().setNumeroSesion(mundo.getArchivo().getNumeroSesion()+1);
					break;
				case("seminario2"):
					gui.Information(mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+"\n"+mundo.getSeminario().escribirdesdeNombres(mundo.getArchivo().leerDesdenombresTXT())));
					mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+mundo.getSeminario().capturarSujeto());
					mundo.getArchivo().setNumeroSesion(mundo.getArchivo().getNumeroSesion()+1);
					break;
				}
			} 
			catch (Exception errorConsola) 
			{
				gui.ExceptionError(errorConsola.toString(), "Ha ocurrido un error fatal");
			}
		}
	}
}
