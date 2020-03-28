package scik.controlador.documento;

import javax.swing.JTextField;

/**
 * Interfaz de la insercion de documento
 * 
 * Metodos disponibles para el controlador de insercion de documento
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IDocumentoIns
{
    public void cargar(JTextField txtDocCod);
    public void cancelar();
    public void aceptar(JTextField txtDocCod, JTextField txtDocNom);
}
