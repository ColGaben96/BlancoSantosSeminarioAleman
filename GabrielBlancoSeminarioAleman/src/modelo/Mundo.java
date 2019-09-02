package modelo;

public class Mundo 
{
	private Archivo archivo;
	private Mundo mundo;
	
	public Mundo()
	{
		archivo = new Archivo();
		mundo = new Mundo();
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public Mundo getMundo() {
		return mundo;
	}
	
	
}
