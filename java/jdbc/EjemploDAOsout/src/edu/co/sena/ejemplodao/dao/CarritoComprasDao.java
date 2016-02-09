/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.dao;

import edu.co.sena.ejemplodao.dto.*;
import edu.co.sena.ejemplodao.exceptions.*;

public interface CarritoComprasDao
{
	/** 
	 * Inserts a new row in the carrito_compras table.
	 */
	public CarritoComprasPk insert(CarritoCompras dto) throws CarritoComprasDaoException;

	/** 
	 * Updates a single row in the carrito_compras table.
	 */
	public void update(CarritoComprasPk pk, CarritoCompras dto) throws CarritoComprasDaoException;

	/** 
	 * Deletes a single row in the carrito_compras table.
	 */
	public void delete(CarritoComprasPk pk) throws CarritoComprasDaoException;

	/** 
	 * Returns the rows from the carrito_compras table that matches the specified primary-key value.
	 */
	public CarritoCompras findByPrimaryKey(CarritoComprasPk pk) throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the criteria 'ID_CARRITO = :idCarrito'.
	 */
	public CarritoCompras findByPrimaryKey(String idCarrito) throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the criteria ''.
	 */
	public CarritoCompras[] findAll() throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the criteria 'ID_CARRITO = :idCarrito'.
	 */
	public CarritoCompras[] findWhereIdCarritoEquals(String idCarrito) throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the criteria 'TOTAL = :total'.
	 */
	public CarritoCompras[] findWhereTotalEquals(double total) throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public CarritoCompras[] findWhereSubtotalEquals(double subtotal) throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the criteria 'IMPUESTOS = :impuestos'.
	 */
	public CarritoCompras[] findWhereImpuestosEquals(double impuestos) throws CarritoComprasDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the carrito_compras table that match the specified arbitrary SQL statement
	 */
	public CarritoCompras[] findByDynamicSelect(String sql, Object[] sqlParams) throws CarritoComprasDaoException;

	/** 
	 * Returns all rows from the carrito_compras table that match the specified arbitrary SQL statement
	 */
	public CarritoCompras[] findByDynamicWhere(String sql, Object[] sqlParams) throws CarritoComprasDaoException;

}
