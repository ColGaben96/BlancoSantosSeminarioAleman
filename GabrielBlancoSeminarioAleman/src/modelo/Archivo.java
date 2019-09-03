package modelo;

import java.io.*;

public class Archivo 
{
	private File file;
	private FileWriter fileWriter;
	private FileReader fileReader;
	private PrintWriter printWriter;
	private BufferedReader bufferedReader;
	private int a = 0;
	
	public String escribirArchivo(String pLinea)
	{
		try 
		{
			File elDirectorio = new File("./docs/SysFiles");
			if(!elDirectorio.exists())
			{
				elDirectorio.mkdir();
			}
			file = new File(elDirectorio+"/Sesion"+a+".txt");
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
		a++;
		return "Se ha creado el archivo correctamente en "+file.getAbsolutePath();
	}
	
	public String lecturaArchivo()
	{
		String lineaAnterior = "";
		try 
		{
			File elDirectorio = new File("./docs/SysFiles/Sesion"+a+".txt");
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
			return " ";
		}
		catch (IOException e) 
		{
			return "Ocurrio un error en la lectura del archivo.\n Causas: "+e.getMessage();
		}
		
		return lineaAnterior;
	}
}
