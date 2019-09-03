package modelo;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Archivo 
{
	private File file;
	private FileWriter fileWriter;
	private FileReader fileReader;
	private PrintWriter printWriter;
	private BufferedReader bufferedReader;
	
	public String escribirArchivo(String pLinea)
	{
		try 
		{
			File elDirectorio = new File("./docs/SysFiles");
			if(!elDirectorio.exists())
			{
				elDirectorio.mkdir();
			}
			file = new File(elDirectorio+"/Sesion.txt");
			fileWriter = new FileWriter(file);
			printWriter = new PrintWriter(fileWriter);
			for (int i = 0; i < 1; i++) 
			{
				printWriter.println(pLinea);
			}
			fileWriter.close();
		}
		catch (IOException e) 
		{
			return "Ocurrio un error en la escritura del archivo.\n Causas: "+e.getMessage();
		}
		return "Se ha creado el archivo correctamente en "+file.getAbsolutePath();
	}
	
	public String lecturaArchivo()
	{
		String lineaAnterior = "";
		try 
		{
			File elDirectorio = new File("./docs/SysFiles/Sesion.txt");
			file = new File(elDirectorio+"/");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String linea = bufferedReader.readLine();
			while(linea != null)
			{
				lineaAnterior += linea +"\n";
				linea = bufferedReader.readLine();
			}
			fileReader.close();
		}
		catch (FileNotFoundException e)
		{
			Date date = new Date();
			DateFormat format = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
			return "Comienza el archivo: "+format.format(date)+"\n";
		}
		catch (IOException e) 
		{
			return "Ocurrio un error en la lectura del archivo.\n Causas: "+e.getMessage();
		}
		
		return lineaAnterior;
	}
}
