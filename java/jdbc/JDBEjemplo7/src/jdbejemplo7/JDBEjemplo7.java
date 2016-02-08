/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbejemplo7;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hernando
 */
public class JDBEjemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tienda_online2";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        Statement sentencia = null;
        ResultSet rs = null;
        int i = 1;

//        String sql = "INSERT INTO `tienda_online2`.`catalogo`\n"
//                + "(`ID_CATALOGO`,\n"
//                + "`NOMBRE_CATALOGO`,\n"
//                + "`DESCRIPCION`)\n"
//                + "VALUES\n"
//                + "(6,\n"
//                + "'ADIDAS',\n"
//                + "'cxcasdfasdfsdfasdf');";
//        String sql = "DELETE FROM `tienda_online2`.`catalogo`\n"
//                + "WHERE ID_CATALOGO=7;";
        String var = JOptionPane.showInputDialog("digite el numero a actulaizar");
        String sql = "UPDATE `tienda_online2`.`catalogo`\n"
                + "SET\n"
                + "`NOMBRE_CATALOGO` = 'jajajaja',\n"
                + "`DESCRIPCION` = 'jasdhfkjahsdf'\n"
                + "WHERE `ID_CATALOGO` = "+ var +" ;";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");
            sentencia = conexion.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);

            int resultado = sentencia.executeUpdate(sql);

            if (resultado == 1) {
                System.out.println("se inserto");
            } else {
                System.out.println("no se inserto");
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

            //cerre la conexion
            if (conexion != null) {
                conexion.close();
                System.out.println("se cerro la conexion correctamente");
            }
        }
    }

}
