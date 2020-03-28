package scik.controlador.usuario;

import javax.swing.JTable;

/**
 * Interfaz de la gestion de usuario
 * 
 * Metodos disponibles para el controlador de gestion de usuario
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IUsuario
{
    public void menu();
    public void registrar();
    public void cargar(JTable tblRegistros);
    public void modificar(JTable tblRegistros);
    public void eliminar(JTable tblRegistros);
}
