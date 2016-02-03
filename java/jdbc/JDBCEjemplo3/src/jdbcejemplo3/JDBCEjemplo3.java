/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection conexion = null;

        try {

            String servidor = "jdbc:mysql://localhost/onlineshop";
            String usuarioDB = "root";
            String passwordDB = "123456789";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            if(conexion.isClosed()){
                System.out.println("la conexion esta cerrada");
            
            }else{
                System.out.println("la conexion esta abierta");
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }

        }
    }
}

