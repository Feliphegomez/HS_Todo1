package scik.controlador.unidad;

import javax.swing.JTextField;

/**
 * Interfaz de la insercion de unidad
 * 
 * Metodos disponibles para el controlador de insercion de unidad
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IUnidadIns
{
    public void cargar(JTextField txtUniCod);
    public void aceptar(JTextField txtUniCod, JTextField txtUniDes);
    public void cancelar();
}
