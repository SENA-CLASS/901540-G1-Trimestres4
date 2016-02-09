/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the carrito_compras table.
 */
public class CarritoComprasPk implements Serializable
{
	protected String idCarrito;

	/** 
	 * Sets the value of idCarrito
	 */
	public void setIdCarrito(String idCarrito)
	{
		this.idCarrito = idCarrito;
	}

	/** 
	 * Gets the value of idCarrito
	 */
	public String getIdCarrito()
	{
		return idCarrito;
	}

	/**
	 * Method 'CarritoComprasPk'
	 * 
	 */
	public CarritoComprasPk()
	{
	}

	/**
	 * Method 'CarritoComprasPk'
	 * 
	 * @param idCarrito
	 */
	public CarritoComprasPk(final String idCarrito)
	{
		this.idCarrito = idCarrito;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CarritoComprasPk)) {
			return false;
		}
		
		final CarritoComprasPk _cast = (CarritoComprasPk) _other;
		if (idCarrito == null ? _cast.idCarrito != idCarrito : !idCarrito.equals( _cast.idCarrito )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (idCarrito != null) {
			_hashCode = 29 * _hashCode + idCarrito.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.dto.CarritoComprasPk: " );
		ret.append( "idCarrito=" + idCarrito );
		return ret.toString();
	}

}
