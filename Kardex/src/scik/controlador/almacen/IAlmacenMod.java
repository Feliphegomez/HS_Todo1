package scik.controlador.almacen;

import javax.swing.JTextField;

/**
 * Interfaz de la modificacion de almacen
 * 
 * Metodos disponibles para el controlador de moficacion de almacen
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IAlmacenMod
{
    public void cargar(JTextField txtAlmCod, JTextField txtAlmNom, JTextField txtAlmUbi);
    public void aceptar(JTextField txtAlmNom, JTextField txtAlmUbi);
    public void cancelar();
}
