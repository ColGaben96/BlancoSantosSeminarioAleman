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
		try {
			
			int  opc = Integer.parseInt(gui.pedirDato());
			
			if(opc == 1) {
				
				int numeroSujeto = Integer.parseInt(gui.pedirDato());
				gui.Information(mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+"\n"+mundo.getSeminario().escribirdesdeNombres(mundo.getArchivo().leerDesdenombresTXT())));
				//mundo.getArchivo().escribirArchivo(mundo.getArchivo().lecturaArchivo()+mundo.getSeminario().capturarSujeto());
				//mundo.getArchivo().setNumeroSesion(mundo.getArchivo().getNumeroSesion()+1);
				
			}
			
			if(opc == 2) {
				
			}
			
			if(opc == 3 ) {
				
			}
			
		} catch (Exception e) {
			
			System.out.println("Ingrese numeros , no letras");
		}
		
	}
}
