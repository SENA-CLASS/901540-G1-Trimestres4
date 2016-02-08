/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcejemplo9;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hernando
 */
public class JDBCEjemplo9 {

    public static void main(String[] args) throws SQLException {
        java.sql.Connection conexion = null;
        String servidor = "jdbc:mysql://localhost/tienda_online2";
        String usuarioDB = "root";
        String passwordDB = "123456789";
        CallableStatement sentencia = null;
        ResultSet rs  =null;
        String sql = "select sin(?);";

        System.out.println(sql);

        try {
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
            System.out.println("se conecto");

            sentencia = conexion.prepareCall(sql);
            sentencia.setInt(1, 100);
            
            System.out.println("sentencia ejecutada " + sql );

            boolean resultado = sentencia.execute();
			
           
            
            rs = sentencia.getResultSet();
            
            if (!rs.wasNull()) {

                  
                    while (rs.next() == true) {
                        System.out.print(rs.getString(1)+"\t");
                        
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
