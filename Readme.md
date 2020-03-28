# KARDEX V1
Proyecto Kardex
## Requisitos previos:
 - Java JDK 8
 - MySQL Server

## Instalación - Desarrollador
 - Clonar el proyecto en Eclipse o NetBeans
 - Crear una base de datos con el nombre "BD_KARDEX" o verificar que el usuario pueda crear bases de datos nuevas y tablas (ejmp: remote_acces.sql).
 - Modificar el archivo kardex/Kardex/conexion.dat, con sus datos de usuario, password y host. Por defecto el host es '181.129.103.142', el usuario es 'kardex' y el password 'kardex2020'. No dejar espacios después del símbolo '=', además los datos deben empezar desde la primera línea sin dejar saltos de líneas antes. El host también puede ser la dirección IP de una máquina remota en red local. Ejemplo: 181.129.103.142 (Servidor de pruebas)
 **Nota**: Se recomienda que la base de datos sea local ya que se pueden presentar problemas de conexion en algunos servidores externos según su configuración.
```sql
host=181.129.103.142
usuario=kardex
password=kardex2020

No editar este archivo.
```
 - Ejecutar los scripts SQL en el servidor MySQL en el siguiente orden: 
    - *script.sql*
    - *triggers.sql*
    - *vistas.sql*
    - *datos.sql*

 - Al ejecutar la aplicación es posible logearse con el usuario *admin* y contraseña *admin*

## Librerias
Las librerias se encuentran en la carpeta "libs" importalas en caso de no tenerlas.
- AutoCompleter
- itextpdf-5.5.6
- jcalendar-1.4
- JTattoo-1.6.11
- mysql-connector-java-5.0.8-bin