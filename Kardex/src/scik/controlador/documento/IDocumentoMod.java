package scik.controlador.documento;

import javax.swing.JTextField;

/**
 * Interfaz de la modificacion de documento
 * 
 * Metodos disponibles para el controlador de moficacion de documento
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IDocumentoMod
{
    public void cargar(JTextField txtDocCod, JTextField txtDocNom);
    public void cancelar();
    public void aceptar(JTextField txtDocNom);
}
