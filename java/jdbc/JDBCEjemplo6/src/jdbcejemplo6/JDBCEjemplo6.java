/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo6;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tienda_online2";
        String usuarioDB = "usuario";
        String passwordDB = "12345";
        Statement sentencia = null;
        ResultSet rs = null;
        int i = 1;
        String sql = "select * from tienda_online2.catalogo;";
        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.createStatement();

            rs = sentencia.executeQuery(sql);

            if (!rs.wasNull()) {
                while (rs.next()) {
                    System.out.println("id catalogo: " + rs.getInt(1));
                    System.out.println("nombre del catalogo: " + rs.getString(2));
                    System.out.println("descripcion: " + rs.getString(3));
                    System.out.println("------------------------------------------------------");
                }
            } else {
                System.out.println("no hay datos");
            }

//se liberan los recursos utilizados por la sentencia
        } catch (SQLException e) {
            System.err.println(e.toString());
        } finally {
            //cerrar el statement
            if (sentencia != null) {
                sentencia.close();
                System.out.println("se cerro el statement");
            }
            //cerre el rs
            if (rs != null) {
               
                    rs.close();
                    System.out.println("se cerro el resultset");
                
            }
            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }

}
