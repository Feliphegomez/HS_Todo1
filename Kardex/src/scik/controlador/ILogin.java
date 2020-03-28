package scik.controlador;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Interfaz del controlador de la vista del Login
 * 
 * @author FelipheGomez
 * @version 1.0
 * @since 2020-03-17
 */
public interface ILogin
{
    /**
     * Valida el nombre de usuario y la contraseña ingresados, si los datos
     * son correctos accede a la ventana del menú principal.
     * @param txtUsuario    Nombre de usuario
     * @param txtPass       Contraseña
     */
    public void validar(JTextField txtUsuario, JPasswordField txtPass);
    
    /**
     * Acceso a la ventana de configuración de la base de datos.
     */
    public void configuracion();
    
    /**
     * Sale del software.
     */
    public void salir();
}
