/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.modelo.dto;

import edu.co.sena.ejemplodao.modelo.dao.*;
import edu.co.sena.ejemplodao.modelo.factory.*;
import edu.co.sena.ejemplodao.modelo.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Pedido implements Serializable
{
	/** 
	 * This attribute maps to the column FACTURA_ID_FACTURA in the pedido table.
	 */
	protected int facturaIdFactura;

	/** 
	 * This attribute maps to the column TOTAL in the pedido table.
	 */
	protected double total;

	/** 
	 * This attribute maps to the column SUBTOTAL in the pedido table.
	 */
	protected double subtotal;

	/** 
	 * This attribute maps to the column IMPUESTOS in the pedido table.
	 */
	protected double impuestos;

	/**
	 * Method 'Pedido'
	 * 
	 */
	public Pedido()
	{
	}

	/**
	 * Method 'getFacturaIdFactura'
	 * 
	 * @return int
	 */
	public int getFacturaIdFactura()
	{
		return facturaIdFactura;
	}

	/**
	 * Method 'setFacturaIdFactura'
	 * 
	 * @param facturaIdFactura
	 */
	public void setFacturaIdFactura(int facturaIdFactura)
	{
		this.facturaIdFactura = facturaIdFactura;
	}

	/**
	 * Method 'getTotal'
	 * 
	 * @return double
	 */
	public double getTotal()
	{
		return total;
	}

	/**
	 * Method 'setTotal'
	 * 
	 * @param total
	 */
	public void setTotal(double total)
	{
		this.total = total;
	}

	/**
	 * Method 'getSubtotal'
	 * 
	 * @return double
	 */
	public double getSubtotal()
	{
		return subtotal;
	}

	/**
	 * Method 'setSubtotal'
	 * 
	 * @param subtotal
	 */
	public void setSubtotal(double subtotal)
	{
		this.subtotal = subtotal;
	}

	/**
	 * Method 'getImpuestos'
	 * 
	 * @return double
	 */
	public double getImpuestos()
	{
		return impuestos;
	}

	/**
	 * Method 'setImpuestos'
	 * 
	 * @param impuestos
	 */
	public void setImpuestos(double impuestos)
	{
		this.impuestos = impuestos;
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
		
		if (!(_other instanceof Pedido)) {
			return false;
		}
		
		final Pedido _cast = (Pedido) _other;
		if (facturaIdFactura != _cast.facturaIdFactura) {
			return false;
		}
		
		if (total != _cast.total) {
			return false;
		}
		
		if (subtotal != _cast.subtotal) {
			return false;
		}
		
		if (impuestos != _cast.impuestos) {
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
		_hashCode = 29 * _hashCode + facturaIdFactura;
		long temp_total = Double.doubleToLongBits(total);
		_hashCode = 29 * _hashCode + (int) (temp_total ^ (temp_total >>> 32));
		long temp_subtotal = Double.doubleToLongBits(subtotal);
		_hashCode = 29 * _hashCode + (int) (temp_subtotal ^ (temp_subtotal >>> 32));
		long temp_impuestos = Double.doubleToLongBits(impuestos);
		_hashCode = 29 * _hashCode + (int) (temp_impuestos ^ (temp_impuestos >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PedidoPk
	 */
	public PedidoPk createPk()
	{
		return new PedidoPk(facturaIdFactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.modelo.dto.Pedido: " );
		ret.append( "facturaIdFactura=" + facturaIdFactura );
		ret.append( ", total=" + total );
		ret.append( ", subtotal=" + subtotal );
		ret.append( ", impuestos=" + impuestos );
		return ret.toString();
	}

}