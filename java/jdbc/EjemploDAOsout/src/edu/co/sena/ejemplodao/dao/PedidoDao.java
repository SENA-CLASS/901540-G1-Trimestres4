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

public interface PedidoDao
{
	/** 
	 * Inserts a new row in the pedido table.
	 */
	public PedidoPk insert(Pedido dto) throws PedidoDaoException;

	/** 
	 * Updates a single row in the pedido table.
	 */
	public void update(PedidoPk pk, Pedido dto) throws PedidoDaoException;

	/** 
	 * Deletes a single row in the pedido table.
	 */
	public void delete(PedidoPk pk) throws PedidoDaoException;

	/** 
	 * Returns the rows from the pedido table that matches the specified primary-key value.
	 */
	public Pedido findByPrimaryKey(PedidoPk pk) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'FACTURA_ID_FACTURA = :facturaIdFactura'.
	 */
	public Pedido findByPrimaryKey(int facturaIdFactura) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria ''.
	 */
	public Pedido[] findAll() throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'FACTURA_ID_FACTURA = :facturaIdFactura'.
	 */
	public Pedido[] findByFactura(int facturaIdFactura) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'FACTURA_ID_FACTURA = :facturaIdFactura'.
	 */
	public Pedido[] findWhereFacturaIdFacturaEquals(int facturaIdFactura) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'TOTAL = :total'.
	 */
	public Pedido[] findWhereTotalEquals(double total) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'SUBTOTAL = :subtotal'.
	 */
	public Pedido[] findWhereSubtotalEquals(double subtotal) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the criteria 'IMPUESTOS = :impuestos'.
	 */
	public Pedido[] findWhereImpuestosEquals(double impuestos) throws PedidoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicSelect(String sql, Object[] sqlParams) throws PedidoDaoException;

	/** 
	 * Returns all rows from the pedido table that match the specified arbitrary SQL statement
	 */
	public Pedido[] findByDynamicWhere(String sql, Object[] sqlParams) throws PedidoDaoException;

}
