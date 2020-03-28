package scik.controlador.unidad;

import javax.swing.JTextField;

/**
 * Interfaz de la modificacion de unidad
 * 
 * Metodos disponibles para el controlador de moficacion de unidad
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IUnidadMod
{
    public void cargar(JTextField txtUniCod, JTextField txtUniDes);
    public void aceptar(JTextField txtUniDes);
    public void cancelar();
}
