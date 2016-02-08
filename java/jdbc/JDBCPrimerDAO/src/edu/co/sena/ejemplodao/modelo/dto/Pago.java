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

public class Pago implements Serializable
{
	/** 
	 * This attribute maps to the column FACTURA_ID_FACTURA in the pago table.
	 */
	protected int facturaIdFactura;

	/** 
	 * This attribute maps to the column TIPO_PAGO in the pago table.
	 */
	protected String tipoPago;

	/** 
	 * This attribute maps to the column NUMERO_CUENTA in the pago table.
	 */
	protected String numeroCuenta;

	/** 
	 * This attribute maps to the column NUMERO_TARGETA in the pago table.
	 */
	protected int numeroTargeta;

	/** 
	 * This attribute represents whether the primitive attribute numeroTargeta is null.
	 */
	protected boolean numeroTargetaNull = true;

	/**
	 * Method 'Pago'
	 * 
	 */
	public Pago()
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
	 * Method 'getTipoPago'
	 * 
	 * @return String
	 */
	public String getTipoPago()
	{
		return tipoPago;
	}

	/**
	 * Method 'setTipoPago'
	 * 
	 * @param tipoPago
	 */
	public void setTipoPago(String tipoPago)
	{
		this.tipoPago = tipoPago;
	}

	/**
	 * Method 'getNumeroCuenta'
	 * 
	 * @return String
	 */
	public String getNumeroCuenta()
	{
		return numeroCuenta;
	}

	/**
	 * Method 'setNumeroCuenta'
	 * 
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(String numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * Method 'getNumeroTargeta'
	 * 
	 * @return int
	 */
	public int getNumeroTargeta()
	{
		return numeroTargeta;
	}

	/**
	 * Method 'setNumeroTargeta'
	 * 
	 * @param numeroTargeta
	 */
	public void setNumeroTargeta(int numeroTargeta)
	{
		this.numeroTargeta = numeroTargeta;
		this.numeroTargetaNull = false;
	}

	/**
	 * Method 'setNumeroTargetaNull'
	 * 
	 * @param value
	 */
	public void setNumeroTargetaNull(boolean value)
	{
		this.numeroTargetaNull = value;
	}

	/**
	 * Method 'isNumeroTargetaNull'
	 * 
	 * @return boolean
	 */
	public boolean isNumeroTargetaNull()
	{
		return numeroTargetaNull;
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
		
		if (!(_other instanceof Pago)) {
			return false;
		}
		
		final Pago _cast = (Pago) _other;
		if (facturaIdFactura != _cast.facturaIdFactura) {
			return false;
		}
		
		if (tipoPago == null ? _cast.tipoPago != tipoPago : !tipoPago.equals( _cast.tipoPago )) {
			return false;
		}
		
		if (numeroCuenta == null ? _cast.numeroCuenta != numeroCuenta : !numeroCuenta.equals( _cast.numeroCuenta )) {
			return false;
		}
		
		if (numeroTargeta != _cast.numeroTargeta) {
			return false;
		}
		
		if (numeroTargetaNull != _cast.numeroTargetaNull) {
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
		if (tipoPago != null) {
			_hashCode = 29 * _hashCode + tipoPago.hashCode();
		}
		
		if (numeroCuenta != null) {
			_hashCode = 29 * _hashCode + numeroCuenta.hashCode();
		}
		
		_hashCode = 29 * _hashCode + numeroTargeta;
		_hashCode = 29 * _hashCode + (numeroTargetaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PagoPk
	 */
	public PagoPk createPk()
	{
		return new PagoPk(facturaIdFactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.modelo.dto.Pago: " );
		ret.append( "facturaIdFactura=" + facturaIdFactura );
		ret.append( ", tipoPago=" + tipoPago );
		ret.append( ", numeroCuenta=" + numeroCuenta );
		ret.append( ", numeroTargeta=" + numeroTargeta );
		return ret.toString();
	}

}
