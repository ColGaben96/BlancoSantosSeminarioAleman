package vista;

import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * @author Gabriel Blanco - Julian Santos
 *
 */
public class Interfaz 
{
	/**
	 *  Utilizacion de la libreria JOptionPane para tener la interaccion con el usuario
	 */
	
	public void Information(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Operacion Finalizada", JOptionPane.INFORMATION_MESSAGE); //Aviso de finalización de operación
	}
	
	public void Error(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Error", JOptionPane.ERROR_MESSAGE); //Aviso de error
	}
	public void ExceptionError(String insertyerMessageHere, String title)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, title, JOptionPane.ERROR_MESSAGE); //Aviso de Error Fatal que cubre la excepcion.
	}
	public void WarningMessage(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Advertencia", JOptionPane.WARNING_MESSAGE); //Aviso de advertencia
	}
	public String AppInput(InputStream com, String insertyerMessageHere, String title)
	{
		return JOptionPane.showInputDialog(null, insertyerMessageHere, title, JOptionPane.PLAIN_MESSAGE); //Dialogo de entrada
	}
	public void helpMessage(String insertyerMessageHere, ImageIcon icon)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Ayuda", JOptionPane.PLAIN_MESSAGE, icon);
	}
	
	public String pedirDato() {
		return (JOptionPane.showInputDialog(null,"Ingrese un numero para seleccionar una opcion\n" + "  1.Imprimir Sesion \n"
						+ "  2.Numero de Sesion\n" , "Gabriel Blanco - Julian Santos - Seminario", JOptionPane.INFORMATION_MESSAGE));
	}
}
