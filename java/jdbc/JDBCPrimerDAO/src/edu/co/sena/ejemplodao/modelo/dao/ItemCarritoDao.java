/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.dao;

import edu.co.sena.ejemplodao.modelo.dto.*;
import edu.co.sena.ejemplodao.modelo.exceptions.*;

public interface ItemCarritoDao
{
	/** 
	 * Inserts a new row in the item_carrito table.
	 */
	public ItemCarritoPk insert(ItemCarrito dto) throws ItemCarritoDaoException;

	/** 
	 * Updates a single row in the item_carrito table.
	 */
	public void update(ItemCarritoPk pk, ItemCarrito dto) throws ItemCarritoDaoException;

	/** 
	 * Deletes a single row in the item_carrito table.
	 */
	public void delete(ItemCarritoPk pk) throws ItemCarritoDaoException;

	/** 
	 * Returns the rows from the item_carrito table that matches the specified primary-key value.
	 */
	public ItemCarrito findByPrimaryKey(ItemCarritoPk pk) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CARRITO_COMPRAS_ID_CARRITO = :carritoComprasIdCarrito AND PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public ItemCarrito findByPrimaryKey(String carritoComprasIdCarrito, String productoIdProducto) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria ''.
	 */
	public ItemCarrito[] findAll() throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CARRITO_COMPRAS_ID_CARRITO = :carritoComprasIdCarrito'.
	 */
	public ItemCarrito[] findByCarritoCompras(String carritoComprasIdCarrito) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public ItemCarrito[] findByProducto(String productoIdProducto) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CARRITO_COMPRAS_ID_CARRITO = :carritoComprasIdCarrito'.
	 */
	public ItemCarrito[] findWhereCarritoComprasIdCarritoEquals(String carritoComprasIdCarrito) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'PRODUCTO_ID_PRODUCTO = :productoIdProducto'.
	 */
	public ItemCarrito[] findWhereProductoIdProductoEquals(String productoIdProducto) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'CANTIDAD = :cantidad'.
	 */
	public ItemCarrito[] findWhereCantidadEquals(int cantidad) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'VALOR_UNITARIO = :valorUnitario'.
	 */
	public ItemCarrito[] findWhereValorUnitarioEquals(double valorUnitario) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the criteria 'VALOR_TOTAL = :valorTotal'.
	 */
	public ItemCarrito[] findWhereValorTotalEquals(double valorTotal) throws ItemCarritoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the item_carrito table that match the specified arbitrary SQL statement
	 */
	public ItemCarrito[] findByDynamicSelect(String sql, Object[] sqlParams) throws ItemCarritoDaoException;

	/** 
	 * Returns all rows from the item_carrito table that match the specified arbitrary SQL statement
	 */
	public ItemCarrito[] findByDynamicWhere(String sql, Object[] sqlParams) throws ItemCarritoDaoException;

}