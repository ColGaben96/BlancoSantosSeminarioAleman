package modelo;
/**
 * @author Gabriel Blanco - Julian Santos
 *
 */
public class Mundo 
{
	/**
	 * Atributos que vienen del paquete Modelo
	 */
	private Archivo archivo;
	private Seminario seminario;
	private Propiedades propiedades;
	
	public Mundo()
	{
		archivo = new Archivo();
		seminario = new Seminario();
		propiedades = new Propiedades();
	}
	
	/**
	 * Getters
	 */

	public Archivo getArchivo() {
		return archivo;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public Propiedades getPropiedades() {
		return propiedades;
	}
	
	
	
}
