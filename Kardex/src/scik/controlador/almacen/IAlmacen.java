package scik.controlador.almacen;

import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 * Interfaz de la gestion de almacen
 * 
 * Metodos disponibles para el controlador de gestion de almacen
 *  
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */

public interface IAlmacen
{
    public void cargar(JTable tblRegistros, JTextField txtBuscar);
    public void actualizarEst(JTable registros, JCheckBox est);
    public void menu();
    public void insertar();
    public void modificar(JTable tblRegistros);
    public void activarDesactivar(JTable tblRegistros, JCheckBox chEst);
    public void eliminar(JTable tblRegistros, JCheckBox est);
    public void generarReporte();
    public void buscarAlmacen(String filtro, JTextField buscar, JTable tablaAlmacen);
}
