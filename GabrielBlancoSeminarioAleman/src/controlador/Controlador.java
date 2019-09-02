package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador 
{
	private Mundo mundo;
	private Interfaz gui;
	private String comando;
	
	public Controlador()
	{
		mundo = new Mundo();
		gui = new Interfaz();
		comando = new String();
		iniciarPrograma();
	}
	
	public void iniciarPrograma()
	{
		boolean activo = true;
		while(activo == true)
		{
			try 
			{
				comando = gui.AppInput(System.in, "Ingresa un comando", "Gabriel Blanco; Julian Santos - Seminario Aleman");
				switch(comando)
				{
				default:
					gui.Error(comando+" no es valido. Escribe \"ayuda\" para mas informacion.");
					break;
				case("ayuda"):
					gui.Information("\"salir\" salir");
					break;
				case("salir"):
					activo = false;
					break;
				case("seminario"):
					gui.Information(mundo.getSeminario().capturarSujeto());
					for (int i = 0; i < 1; i++) 
					{
						mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+"\n"+mundo.getSeminario().escribirLista());
					}
					break;
				}
			} 
			catch (Exception errorConsola) 
			{
				gui.ExceptionError(errorConsola.getMessage(), "Ha ocurrido un error fatal");
			}
		}
	}
}
