package modelo;

public class Mundo 
{
	private Archivo archivo;
	private Seminario seminario;
	
	public Mundo()
	{
		archivo = new Archivo();
		seminario = new Seminario();
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public Seminario getSeminario() {
		return seminario;
	}
	
}
