/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo8;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tienda_online2";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        PreparedStatement sentencia = null;
        String sqlPrepared = "SELECT * FROM tienda_online2.catalogo where id_catalogo = ? ;";
         ResultSet resultado;
        System.out.println(sqlPrepared);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sqlPrepared);

            sentencia.setInt(1, 1);
            

            resultado = sentencia.executeQuery();
			
            if (!resultado.wasNull()) {
                while (resultado.next()) {
                    System.out.println("id catalogo: " + resultado.getInt(1));
                 
                    System.out.println("------------------------------------------------------");
                }
                
               
                }

        } catch (SQLException e) {
            System.err.println("error: " + e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }
    
}
