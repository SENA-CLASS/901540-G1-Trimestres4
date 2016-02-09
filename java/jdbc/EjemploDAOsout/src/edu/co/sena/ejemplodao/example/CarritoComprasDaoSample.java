/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.example;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.ejemplodao.dao.CarritoComprasDao;
import edu.co.sena.ejemplodao.dto.CarritoCompras;
import edu.co.sena.ejemplodao.exceptions.CarritoComprasDaoException;
import edu.co.sena.ejemplodao.factory.CarritoComprasDaoFactory;

public class CarritoComprasDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		 findAll();
		// findWhereIdCarritoEquals("");
		// findWhereTotalEquals(0);
		// findWhereSubtotalEquals(0);
		// findWhereImpuestosEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			CarritoComprasDao _dao = getCarritoComprasDao();
			CarritoCompras _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdCarritoEquals'
	 * 
	 * @param idCarrito
	 */
	public static void findWhereIdCarritoEquals(String idCarrito)
	{
		try {
			CarritoComprasDao _dao = getCarritoComprasDao();
			CarritoCompras _result[] = _dao.findWhereIdCarritoEquals(idCarrito);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTotalEquals'
	 * 
	 * @param total
	 */
	public static void findWhereTotalEquals(double total)
	{
		try {
			CarritoComprasDao _dao = getCarritoComprasDao();
			CarritoCompras _result[] = _dao.findWhereTotalEquals(total);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereSubtotalEquals'
	 * 
	 * @param subtotal
	 */
	public static void findWhereSubtotalEquals(double subtotal)
	{
		try {
			CarritoComprasDao _dao = getCarritoComprasDao();
			CarritoCompras _result[] = _dao.findWhereSubtotalEquals(subtotal);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereImpuestosEquals'
	 * 
	 * @param impuestos
	 */
	public static void findWhereImpuestosEquals(double impuestos)
	{
		try {
			CarritoComprasDao _dao = getCarritoComprasDao();
			CarritoCompras _result[] = _dao.findWhereImpuestosEquals(impuestos);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getCarritoComprasDao'
	 * 
	 * @return CarritoComprasDao
	 */
	public static CarritoComprasDao getCarritoComprasDao()
	{
		return CarritoComprasDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(CarritoCompras dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdCarrito() );
		buf.append( ", " );
		buf.append( dto.getTotal() );
		buf.append( ", " );
		buf.append( dto.getSubtotal() );
		buf.append( ", " );
		buf.append( dto.getImpuestos() );
		System.out.println( buf.toString() );
	}

}
