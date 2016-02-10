/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ingresito.modelo.dao.mysql;

import edu.co.sena.ingresito.modelo.dao.CatalogoDAO;
import edu.co.sena.ingresito.modelo.dto.Catalogo;
import edu.co.sena.ingresito.modelo.dto.CatalogoPk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernando
 */
public class CatalogoDAOImpl implements CatalogoDAO {

    private Connection conexion;

    private final String SQL_SELECT = "select * from " + getTableName() + "";

    private final String SQL_INSERT = "INSERT INTO " + getTableName() + "\n"
            + "(ID_CATALOGO,\n"
            + "NOMBRE_CATALOGO,\n"
            + "DESCRIPCION)\n"
            + "VALUES\n"
            + "(?,?,?)";

    private final String SQL_UPDATE = "UPDATE " + getTableName() + "\n"
            + "SET\n"
            + "NOMBRE_CATALOGO = ?,\n"
            + "DESCRIPCION = ?\n"
            + "WHERE ID_CATALOGO = ?";
    private final String SQL_UPDATEPK = "UPDATE "+ getTableName()+"\n"
            + "SET\n"
            + "ID_CATALOGO = ?\n"
            + "WHERE ID_CATALOGO = ?;";

    public List<Catalogo> findAll() {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Catalogo> lt = new ArrayList<>();

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_SELECT;

            System.out.println("se ejecuto " + SQL);
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();

            if (!rs.wasNull()) {
                while (rs.next()) {
                    Catalogo ct = new Catalogo();
                    ct.setIdCatalogo(rs.getInt(1));
                    ct.setNombreCatalogo(rs.getString(2));
                    ct.setDescripcion(rs.getString(3));
                    lt.add(ct);
                }
            }

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(rs);
            ResourceManager.close(stmt);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }
        return lt;
    }

    public void insert(Catalogo dto) {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_INSERT;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(indice++, dto.getIdCatalogo());
            stmt.setString(indice++, dto.getNombreCatalogo());
            stmt.setString(indice++, dto.getDescripcion());

            rs = stmt.executeUpdate();

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(stmt);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

    public void update(CatalogoPk llaveDto, Catalogo dto) {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_UPDATE;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            stmt = conn.prepareStatement(SQL);
            stmt.setString(indice++, dto.getNombreCatalogo());
            stmt.setString(indice++, dto.getDescripcion());
            stmt.setInt(indice++, llaveDto.getIdCatalogo());

            rs = stmt.executeUpdate();

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(stmt);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

    public void updatePk(CatalogoPk viejo, CatalogoPk nuevo) {
        // declaracion de variables
        final boolean estaConectado = (conexion != null);
        Connection conn = null;
        PreparedStatement stmt = null;
        int rs;

        try {
            // obtener el la conexion 

            if (estaConectado) {
                conn = conexion;
            } else {
                conn = ResourceManager.getConection();
            }

            // construct the SQL statement
            final String SQL = SQL_UPDATEPK;
            int indice = 1;
            System.out.println("se ejecuto " + SQL);
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(indice++, nuevo.getIdCatalogo());
            stmt.setInt(indice++, viejo.getIdCatalogo());
            

            rs = stmt.executeUpdate();

        } catch (Exception _e) {
            System.out.println("error en el findAll");
        } finally {
            ResourceManager.close(stmt);
            if (!estaConectado) {
                ResourceManager.close(conn);
            }
        }

    }

    public String getTableName() {
        return "tienda_online2.catalogo";
    }

}
