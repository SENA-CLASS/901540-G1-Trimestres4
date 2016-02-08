/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo8;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo82 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tienda_online2";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        PreparedStatement sentencia = null;
        String sqlPrepared = "UPDATE `tienda_online2`.`catalogo`\n"
                + "SET\n"
                + "`NOMBRE_CATALOGO` = ?\n"
                + "WHERE `ID_CATALOGO` = ?;";
        int resultado;
        System.out.println(sqlPrepared);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareStatement(sqlPrepared);

            sentencia.setString(1, "nuevo nombre");
            sentencia.setInt(2, 1);
            

            resultado = sentencia.executeUpdate();

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
