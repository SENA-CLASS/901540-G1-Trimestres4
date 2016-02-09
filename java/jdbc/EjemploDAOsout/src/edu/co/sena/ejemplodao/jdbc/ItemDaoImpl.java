/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.jdbc;

import edu.co.sena.ejemplodao.dao.*;
import edu.co.sena.ejemplodao.factory.*;
import edu.co.sena.ejemplodao.dto.*;
import edu.co.sena.ejemplodao.exceptions.*;
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

public class ItemDaoImpl extends AbstractDAO implements ItemDao
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
	protected final String SQL_SELECT = "SELECT PRODUCTO_ID_PRODUCTO, CANTIDAD, COSTO_UNITARIO, COSTO_TOTAL, PEDIDO_FACTURA_ID_FACTURA FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( PRODUCTO_ID_PRODUCTO, CANTIDAD, COSTO_UNITARIO, COSTO_TOTAL, PEDIDO_FACTURA_ID_FACTURA ) VALUES ( ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET PRODUCTO_ID_PRODUCTO = ?, CANTIDAD = ?, COSTO_UNITARIO = ?, COSTO_TOTAL = ?, PEDIDO_FACTURA_ID_FACTURA = ? WHERE PRODUCTO_ID_PRODUCTO = ? AND PEDIDO_FACTURA_ID_FACTURA = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE PRODUCTO_ID_PRODUCTO = ? AND PEDIDO_FACTURA_ID_FACTURA = ?";

	/** 
	 * Index of column PRODUCTO_ID_PRODUCTO
	 */
	protected static final int COLUMN_PRODUCTO_ID_PRODUCTO = 1;

	/** 
	 * Index of column CANTIDAD
	 */
	protected static final int COLUMN_CANTIDAD = 2;

	/** 
	 * Index of column COSTO_UNITARIO
	 */
	protected static final int COLUMN_COSTO_UNITARIO = 3;

	/** 
	 * Index of column COSTO_TOTAL
	 */
	protected static final int COLUMN_COSTO_TOTAL = 4;

	/** 
	 * Index of column PEDIDO_FACTURA_ID_FACTURA
	 */
	protected static final int COLUMN_PEDIDO_FACTURA_ID_FACTURA = 5;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 5;

	/** 
	 * Index of primary-key column PRODUCTO_ID_PRODUCTO
	 */
	protected static final int PK_COLUMN_PRODUCTO_ID_PRODUCTO = 1;

	/** 
	 * Index of primary-key column PEDIDO_FACTURA_ID_FACTURA
	 */
	protected static final int PK_COLUMN_PEDIDO_FACTURA_ID_FACTURA = 2;

	/** 
	 * Inserts a new row in the item table.
	 */
	public ItemPk insert(Item dto) throws ItemDaoException
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
			stmt.setString( index++, dto.getProductoIdProducto() );
			if (dto.isCantidadNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCantidad() );
			}
		
			if (dto.isCostoUnitarioNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getCostoUnitario() );
			}
		
			if (dto.isCostoTotalNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getCostoTotal() );
			}
		
			stmt.setInt( index++, dto.getPedidoFacturaIdFactura() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the item table.
	 */
	public void update(ItemPk pk, Item dto) throws ItemDaoException
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
			stmt.setString( index++, dto.getProductoIdProducto() );
			if (dto.isCantidadNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCantidad() );
			}
		
			if (dto.isCostoUnitarioNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getCostoUnitario() );
			}
		
			if (dto.isCostoTotalNull()) {
				stmt.setNull( index++, java.sql.Types.DOUBLE );
			} else {
				stmt.setDouble( index++, dto.getCostoTotal() );
			}
		
			stmt.setInt( index++, dto.getPedidoFacturaIdFactura() );
			stmt.setString( 6, pk.getProductoIdProducto() );
			stmt.setInt( 7, pk.getPedidoFacturaIdFactura() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the item table.
	 */
	public void delete(ItemPk pk) throws ItemDaoException
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
			stmt.setString( 1, pk.getProductoIdProducto() );
			stmt.setInt( 2, pk.getPedidoFacturaIdFactura() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the item table that matches the specified primary-key value.
	 */
	public Item findByPrimaryKey(ItemPk pk) throws ItemDaoException
	{
		return findByPrimaryKey( pk.getProductoIdProducto(), pk.getPedidoFacturaIdFactura() );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto AND PEDIDO_FACTURA_ID_FACTURA = :pedidoFacturaIdFactura'.
	 */
	public Item findByPrimaryKey(String productoIdProducto, int pedidoFacturaIdFactura) throws ItemDaoException
	{
		Item ret[] = findByDynamicSelect( SQL_SELECT + " WHERE PRODUCTO_ID_PRODUCTO = ? AND PEDIDO_FACTURA_ID_FACTURA = ?", new Object[] { productoIdProducto,  new Integer(pedidoFacturaIdFactura) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the item table that match the criteria ''.
	 */
	public Item[] findAll() throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY PRODUCTO_ID_PRODUCTO, PEDIDO_FACTURA_ID_FACTURA", null );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'PEDIDO_FACTURA_ID_FACTURA = :pedidoFacturaIdFactura'.
	 */
	public Item[] findByPedido(int pedidoFacturaIdFactura) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PEDIDO_FACTURA_ID_FACTURA = ?", new Object[] {  new Integer(pedidoFacturaIdFactura) } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public Item[] findByProducto(String productoIdProducto) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCTO_ID_PRODUCTO = ?", new Object[] { productoIdProducto } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public Item[] findWhereProductoIdProductoEquals(String productoIdProducto) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PRODUCTO_ID_PRODUCTO = ? ORDER BY PRODUCTO_ID_PRODUCTO", new Object[] { productoIdProducto } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public Item[] findWhereCantidadEquals(int cantidad) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CANTIDAD = ? ORDER BY CANTIDAD", new Object[] {  new Integer(cantidad) } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'COSTO_UNITARIO = :costoUnitario'.
	 */
	public Item[] findWhereCostoUnitarioEquals(double costoUnitario) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COSTO_UNITARIO = ? ORDER BY COSTO_UNITARIO", new Object[] {  new Double(costoUnitario) } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'COSTO_TOTAL = :costoTotal'.
	 */
	public Item[] findWhereCostoTotalEquals(double costoTotal) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE COSTO_TOTAL = ? ORDER BY COSTO_TOTAL", new Object[] {  new Double(costoTotal) } );
	}

	/** 
	 * Returns all rows from the item table that match the criteria 'PEDIDO_FACTURA_ID_FACTURA = :pedidoFacturaIdFactura'.
	 */
	public Item[] findWherePedidoFacturaIdFacturaEquals(int pedidoFacturaIdFactura) throws ItemDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PEDIDO_FACTURA_ID_FACTURA = ? ORDER BY PEDIDO_FACTURA_ID_FACTURA", new Object[] {  new Integer(pedidoFacturaIdFactura) } );
	}

	/**
	 * Method 'ItemDaoImpl'
	 * 
	 */
	public ItemDaoImpl()
	{
	}

	/**
	 * Method 'ItemDaoImpl'
	 * 
	 * @param userConn
	 */
	public ItemDaoImpl(final java.sql.Connection userConn)
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
		return "tienda_online2.item";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Item fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Item dto = new Item();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Item[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Item dto = new Item();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Item ret[] = new Item[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Item dto, ResultSet rs) throws SQLException
	{
		dto.setProductoIdProducto( rs.getString( COLUMN_PRODUCTO_ID_PRODUCTO ) );
		dto.setCantidad( rs.getInt( COLUMN_CANTIDAD ) );
		if (rs.wasNull()) {
			dto.setCantidadNull( true );
		}
		
		dto.setCostoUnitario( rs.getDouble( COLUMN_COSTO_UNITARIO ) );
		if (rs.wasNull()) {
			dto.setCostoUnitarioNull( true );
		}
		
		dto.setCostoTotal( rs.getDouble( COLUMN_COSTO_TOTAL ) );
		if (rs.wasNull()) {
			dto.setCostoTotalNull( true );
		}
		
		dto.setPedidoFacturaIdFactura( rs.getInt( COLUMN_PEDIDO_FACTURA_ID_FACTURA ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Item dto)
	{
	}

	/** 
	 * Returns all rows from the item table that match the specified arbitrary SQL statement
	 */
	public Item[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemDaoException
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
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the item table that match the specified arbitrary SQL statement
	 */
	public Item[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemDaoException
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
			throw new ItemDaoException( "Exception: " + _e.getMessage(), _e );
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
