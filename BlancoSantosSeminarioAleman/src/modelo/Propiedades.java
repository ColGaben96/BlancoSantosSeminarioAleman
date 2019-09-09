package modelo;

import java.io.*;
import java.util.Properties;

public class Propiedades 
{
	private Properties property = new Properties();
	private String directorio = "./docs/SysFiles/SysProperties.properties";
	
	public String getPropiedades()
	{
		try 
		{
			property.load(new FileReader(directorio));
			String propiedades = property.getProperty("NumeroSesiones")+"\n";
			propiedades += property.getProperty("numeroRoles");
			return propiedades;
		} 
		catch (FileNotFoundException e)
		{
			return "";
		}
		catch (IOException e) 
		{
			return "Ocurrio un error\n"+e.toString();
		}
	}
	
	public String setPropiedades(int pSesion)
	{
		try 
		{
			property.setProperty("NumeroSesiones", ""+pSesion);
			property.setProperty("numeroRoles", "3");
			property.store(new FileWriter(directorio),"Comentario");
			return "Propiedades guardadas";
		} 
		catch (IOException e) 
		{
			return "Ocurrio un error\n"+e.toString();
		}
	}
}
