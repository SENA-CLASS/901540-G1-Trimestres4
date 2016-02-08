/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.jdbc;

import edu.co.sena.ejemplodao.modelo.dao.*;
import edu.co.sena.ejemplodao.modelo.factory.*;
import edu.co.sena.ejemplodao.modelo.dto.*;
import edu.co.sena.ejemplodao.modelo.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class DomicilioProveeDaoImpl extends AbstractDAO implements DomicilioProveeDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT DIRECCION, TELEFONO, BARRIO, LOCALIDAD, CORREO_POSTAL, MUNICIPIO_ID_MUNICIPIO, PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO, PROVEEDOR_NUM_DOCUMENTO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( DIRECCION, TELEFONO, BARRIO, LOCALIDAD, CORREO_POSTAL, MUNICIPIO_ID_MUNICIPIO, PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO, PROVEEDOR_NUM_DOCUMENTO ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET DIRECCION = ?, TELEFONO = ?, BARRIO = ?, LOCALIDAD = ?, CORREO_POSTAL = ?, MUNICIPIO_ID_MUNICIPIO = ?, PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = ?, PROVEEDOR_NUM_DOCUMENTO = ? WHERE PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = ? AND PROVEEDOR_NUM_DOCUMENTO = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = ? AND PROVEEDOR_NUM_DOCUMENTO = ?";

	/** 
	 * Index of column DIRECCION
	 */
	protected static final int COLUMN_DIRECCION = 1;

	/** 
	 * Index of column TELEFONO
	 */
	protected static final int COLUMN_TELEFONO = 2;

	/** 
	 * Index of column BARRIO
	 */
	protected static final int COLUMN_BARRIO = 3;

	/** 
	 * Index of column LOCALIDAD
	 */
	protected static final int COLUMN_LOCALIDAD = 4;

	/** 
	 * Index of column CORREO_POSTAL
	 */
	protected static final int COLUMN_CORREO_POSTAL = 5;

	/** 
	 * Index of column MUNICIPIO_ID_MUNICIPIO
	 */
	protected static final int COLUMN_MUNICIPIO_ID_MUNICIPIO = 6;

	/** 
	 * Index of column PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO
	 */
	protected static final int COLUMN_PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = 7;

	/** 
	 * Index of column PROVEEDOR_NUM_DOCUMENTO
	 */
	protected static final int COLUMN_PROVEEDOR_NUM_DOCUMENTO = 8;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 8;

	/** 
	 * Index of primary-key column PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO
	 */
	protected static final int PK_COLUMN_PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = 1;

	/** 
	 * Index of primary-key column PROVEEDOR_NUM_DOCUMENTO
	 */
	protected static final int PK_COLUMN_PROVEEDOR_NUM_DOCUMENTO = 2;

	/** 
	 * Inserts a new row in the domicilio_provee table.
	 */
	public DomicilioProveePk insert(DomicilioProvee dto) throws DomicilioProveeDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getDireccion() );
			stmt.setString( index++, dto.getTelefono() );
			stmt.setString( index++, dto.getBarrio() );
			stmt.setString( index++, dto.getLocalidad() );
			stmt.setString( index++, dto.getCorreoPostal() );
			stmt.setInt( index++, dto.getMunicipioIdMunicipio() );
			stmt.setString( index++, dto.getProveedorTipoDocumentoTipoDocumento() );
			stmt.setString( index++, dto.getProveedorNumDocumento() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioProveeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the domicilio_provee table.
	 */
	public void update(DomicilioProveePk pk, DomicilioProvee dto) throws DomicilioProveeDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setString( index++, dto.getDireccion() );
			stmt.setString( index++, dto.getTelefono() );
			stmt.setString( index++, dto.getBarrio() );
			stmt.setString( index++, dto.getLocalidad() );
			stmt.setString( index++, dto.getCorreoPostal() );
			stmt.setInt( index++, dto.getMunicipioIdMunicipio() );
			stmt.setString( index++, dto.getProveedorTipoDocumentoTipoDocumento() );
			stmt.setString( index++, dto.getProveedorNumDocumento() );
			stmt.setString( 9, pk.getProveedorTipoDocumentoTipoDocumento() );
			stmt.setString( 10, pk.getProveedorNumDocumento() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioProveeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the domicilio_provee table.
	 */
	public void delete(DomicilioProveePk pk) throws DomicilioProveeDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setString( 1, pk.getProveedorTipoDocumentoTipoDocumento() );
			stmt.setString( 2, pk.getProveedorNumDocumento() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioProveeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the domicilio_provee table that matches the specified primary-key value.
	 */
	public DomicilioProvee findByPrimaryKey(DomicilioProveePk pk) throws DomicilioProveeDaoException
	{
		return findByPrimaryKey( pk.getProveedorTipoDocumentoTipoDocumento(), pk.getProveedorNumDocumento() );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = :proveedorTipoDocumentoTipoDocumento AND PROVEEDOR_NUM_DOCUMENTO = :proveedorNumDocumento'.
	 */
	public DomicilioProvee findByPrimaryKey(String proveedorTipoDocumentoTipoDocumento, String proveedorNumDocumento) throws DomicilioProveeDaoException
	{
		DomicilioProvee ret[] = findByDynamicSelect( SQL_SELECT + " WHERE PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = ? AND PROVEEDOR_NUM_DOCUMENTO = ?", new Object[] { proveedorTipoDocumentoTipoDocumento, proveedorNumDocumento } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria ''.
	 */
	public DomicilioProvee[] findAll() throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO, PROVEEDOR_NUM_DOCUMENTO", null );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'MUNICIPIO_ID_MUNICIPIO = :municipioIdMunicipio'.
	 */
	public DomicilioProvee[] findByMunicipio(int municipioIdMunicipio) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO_ID_MUNICIPIO = ?", new Object[] {  new Integer(municipioIdMunicipio) } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = :proveedorTipoDocumentoTipoDocumento AND PROVEEDOR_NUM_DOCUMENTO = :proveedorNumDocumento'.
	 */
	public DomicilioProvee[] findByProveedor(String proveedorTipoDocumentoTipoDocumento, String proveedorNumDocumento) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = ? AND PROVEEDOR_NUM_DOCUMENTO = ?", new Object[] { proveedorTipoDocumentoTipoDocumento, proveedorNumDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'DIRECCION = :direccion'.
	 */
	public DomicilioProvee[] findWhereDireccionEquals(String direccion) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DIRECCION = ? ORDER BY DIRECCION", new Object[] { direccion } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'TELEFONO = :telefono'.
	 */
	public DomicilioProvee[] findWhereTelefonoEquals(String telefono) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE TELEFONO = ? ORDER BY TELEFONO", new Object[] { telefono } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'BARRIO = :barrio'.
	 */
	public DomicilioProvee[] findWhereBarrioEquals(String barrio) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE BARRIO = ? ORDER BY BARRIO", new Object[] { barrio } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'LOCALIDAD = :localidad'.
	 */
	public DomicilioProvee[] findWhereLocalidadEquals(String localidad) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LOCALIDAD = ? ORDER BY LOCALIDAD", new Object[] { localidad } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'CORREO_POSTAL = :correoPostal'.
	 */
	public DomicilioProvee[] findWhereCorreoPostalEquals(String correoPostal) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CORREO_POSTAL = ? ORDER BY CORREO_POSTAL", new Object[] { correoPostal } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'MUNICIPIO_ID_MUNICIPIO = :municipioIdMunicipio'.
	 */
	public DomicilioProvee[] findWhereMunicipioIdMunicipioEquals(int municipioIdMunicipio) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MUNICIPIO_ID_MUNICIPIO = ? ORDER BY MUNICIPIO_ID_MUNICIPIO", new Object[] {  new Integer(municipioIdMunicipio) } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = :proveedorTipoDocumentoTipoDocumento'.
	 */
	public DomicilioProvee[] findWhereProveedorTipoDocumentoTipoDocumentoEquals(String proveedorTipoDocumentoTipoDocumento) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO = ? ORDER BY PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO", new Object[] { proveedorTipoDocumentoTipoDocumento } );
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the criteria 'PROVEEDOR_NUM_DOCUMENTO = :proveedorNumDocumento'.
	 */
	public DomicilioProvee[] findWhereProveedorNumDocumentoEquals(String proveedorNumDocumento) throws DomicilioProveeDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PROVEEDOR_NUM_DOCUMENTO = ? ORDER BY PROVEEDOR_NUM_DOCUMENTO", new Object[] { proveedorNumDocumento } );
	}

	/**
	 * Method 'DomicilioProveeDaoImpl'
	 * 
	 */
	public DomicilioProveeDaoImpl()
	{
	}

	/**
	 * Method 'DomicilioProveeDaoImpl'
	 * 
	 * @param userConn
	 */
	public DomicilioProveeDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "tienda_online2.domicilio_provee";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DomicilioProvee fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DomicilioProvee dto = new DomicilioProvee();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DomicilioProvee[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DomicilioProvee dto = new DomicilioProvee();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DomicilioProvee ret[] = new DomicilioProvee[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DomicilioProvee dto, ResultSet rs) throws SQLException
	{
		dto.setDireccion( rs.getString( COLUMN_DIRECCION ) );
		dto.setTelefono( rs.getString( COLUMN_TELEFONO ) );
		dto.setBarrio( rs.getString( COLUMN_BARRIO ) );
		dto.setLocalidad( rs.getString( COLUMN_LOCALIDAD ) );
		dto.setCorreoPostal( rs.getString( COLUMN_CORREO_POSTAL ) );
		dto.setMunicipioIdMunicipio( rs.getInt( COLUMN_MUNICIPIO_ID_MUNICIPIO ) );
		dto.setProveedorTipoDocumentoTipoDocumento( rs.getString( COLUMN_PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO ) );
		dto.setProveedorNumDocumento( rs.getString( COLUMN_PROVEEDOR_NUM_DOCUMENTO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DomicilioProvee dto)
	{
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the specified arbitrary SQL statement
	 */
	public DomicilioProvee[] findByDynamicSelect(String sql, Object[] sqlParams) throws DomicilioProveeDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioProveeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the domicilio_provee table that match the specified arbitrary SQL statement
	 */
	public DomicilioProvee[] findByDynamicWhere(String sql, Object[] sqlParams) throws DomicilioProveeDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DomicilioProveeDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
