/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo1 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException{
        
        // primer ejemplo de una conexion a una base de datos usando el class.forname
       java.sql.Connection conexion = null;
       
       
        String urlServidor = "jdbc:mysql://172.16.0.96:3306/prueba1";
            String usuarioDB="aprendiz";
            String passwordDB="12345";
        try {
            Class.forName("com.mysql.jdbc.Driver");// es para JDBC menores al 4
            
            conexion= DriverManager.getConnection(urlServidor,usuarioDB,passwordDB);//linea para hacer la conexion a la base de datos
            System.out.println("se conecto");
            conexion.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.toString());
        }finally{
            if (conexion!=null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        
        }
        
        
    }
    
}
