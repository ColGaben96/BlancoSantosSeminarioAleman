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
	
	public Mundo()
	{
		archivo = new Archivo();
		seminario = new Seminario();
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
	
}
