package scik.controlador.producto;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * Interfaz de la insercion de producto
 * 
 * Metodos disponibles para el controlador de insercion de producto
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */
public interface IProductoIns
{
    public void cancelar();
    public void cargar(JTextField txtProCod, JComboBox cbxUniDes);
    public void aceptar(JTextField txtProCod, JTextField txtProNom, JTextField txtUniCod);
    public void verUnidad(JComboBox cbxUniDes, JTextField txtUniCod);
}
