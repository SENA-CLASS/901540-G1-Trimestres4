/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.dto;

import edu.co.sena.ejemplodao.dao.*;
import edu.co.sena.ejemplodao.factory.*;
import edu.co.sena.ejemplodao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Item implements Serializable
{
	/** 
	 * This attribute maps to the column PRODUCTO_ID_PRODUCTO in the item table.
	 */
	protected String productoIdProducto;

	/** 
	 * This attribute maps to the column CANTIDAD in the item table.
	 */
	protected int cantidad;

	/** 
	 * This attribute represents whether the primitive attribute cantidad is null.
	 */
	protected boolean cantidadNull = true;

	/** 
	 * This attribute maps to the column COSTO_UNITARIO in the item table.
	 */
	protected double costoUnitario;

	/** 
	 * This attribute represents whether the primitive attribute costoUnitario is null.
	 */
	protected boolean costoUnitarioNull = true;

	/** 
	 * This attribute maps to the column COSTO_TOTAL in the item table.
	 */
	protected double costoTotal;

	/** 
	 * This attribute represents whether the primitive attribute costoTotal is null.
	 */
	protected boolean costoTotalNull = true;

	/** 
	 * This attribute maps to the column PEDIDO_FACTURA_ID_FACTURA in the item table.
	 */
	protected int pedidoFacturaIdFactura;

	/**
	 * Method 'Item'
	 * 
	 */
	public Item()
	{
	}

	/**
	 * Method 'getProductoIdProducto'
	 * 
	 * @return String
	 */
	public String getProductoIdProducto()
	{
		return productoIdProducto;
	}

	/**
	 * Method 'setProductoIdProducto'
	 * 
	 * @param productoIdProducto
	 */
	public void setProductoIdProducto(String productoIdProducto)
	{
		this.productoIdProducto = productoIdProducto;
	}

	/**
	 * Method 'getCantidad'
	 * 
	 * @return int
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * Method 'setCantidad'
	 * 
	 * @param cantidad
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
		this.cantidadNull = false;
	}

	/**
	 * Method 'setCantidadNull'
	 * 
	 * @param value
	 */
	public void setCantidadNull(boolean value)
	{
		this.cantidadNull = value;
	}

	/**
	 * Method 'isCantidadNull'
	 * 
	 * @return boolean
	 */
	public boolean isCantidadNull()
	{
		return cantidadNull;
	}

	/**
	 * Method 'getCostoUnitario'
	 * 
	 * @return double
	 */
	public double getCostoUnitario()
	{
		return costoUnitario;
	}

	/**
	 * Method 'setCostoUnitario'
	 * 
	 * @param costoUnitario
	 */
	public void setCostoUnitario(double costoUnitario)
	{
		this.costoUnitario = costoUnitario;
		this.costoUnitarioNull = false;
	}

	/**
	 * Method 'setCostoUnitarioNull'
	 * 
	 * @param value
	 */
	public void setCostoUnitarioNull(boolean value)
	{
		this.costoUnitarioNull = value;
	}

	/**
	 * Method 'isCostoUnitarioNull'
	 * 
	 * @return boolean
	 */
	public boolean isCostoUnitarioNull()
	{
		return costoUnitarioNull;
	}

	/**
	 * Method 'getCostoTotal'
	 * 
	 * @return double
	 */
	public double getCostoTotal()
	{
		return costoTotal;
	}

	/**
	 * Method 'setCostoTotal'
	 * 
	 * @param costoTotal
	 */
	public void setCostoTotal(double costoTotal)
	{
		this.costoTotal = costoTotal;
		this.costoTotalNull = false;
	}

	/**
	 * Method 'setCostoTotalNull'
	 * 
	 * @param value
	 */
	public void setCostoTotalNull(boolean value)
	{
		this.costoTotalNull = value;
	}

	/**
	 * Method 'isCostoTotalNull'
	 * 
	 * @return boolean
	 */
	public boolean isCostoTotalNull()
	{
		return costoTotalNull;
	}

	/**
	 * Method 'getPedidoFacturaIdFactura'
	 * 
	 * @return int
	 */
	public int getPedidoFacturaIdFactura()
	{
		return pedidoFacturaIdFactura;
	}

	/**
	 * Method 'setPedidoFacturaIdFactura'
	 * 
	 * @param pedidoFacturaIdFactura
	 */
	public void setPedidoFacturaIdFactura(int pedidoFacturaIdFactura)
	{
		this.pedidoFacturaIdFactura = pedidoFacturaIdFactura;
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
		
		if (!(_other instanceof Item)) {
			return false;
		}
		
		final Item _cast = (Item) _other;
		if (productoIdProducto == null ? _cast.productoIdProducto != productoIdProducto : !productoIdProducto.equals( _cast.productoIdProducto )) {
			return false;
		}
		
		if (cantidad != _cast.cantidad) {
			return false;
		}
		
		if (cantidadNull != _cast.cantidadNull) {
			return false;
		}
		
		if (costoUnitario != _cast.costoUnitario) {
			return false;
		}
		
		if (costoUnitarioNull != _cast.costoUnitarioNull) {
			return false;
		}
		
		if (costoTotal != _cast.costoTotal) {
			return false;
		}
		
		if (costoTotalNull != _cast.costoTotalNull) {
			return false;
		}
		
		if (pedidoFacturaIdFactura != _cast.pedidoFacturaIdFactura) {
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
		if (productoIdProducto != null) {
			_hashCode = 29 * _hashCode + productoIdProducto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + cantidad;
		_hashCode = 29 * _hashCode + (cantidadNull ? 1 : 0);
		long temp_costoUnitario = Double.doubleToLongBits(costoUnitario);
		_hashCode = 29 * _hashCode + (int) (temp_costoUnitario ^ (temp_costoUnitario >>> 32));
		_hashCode = 29 * _hashCode + (costoUnitarioNull ? 1 : 0);
		long temp_costoTotal = Double.doubleToLongBits(costoTotal);
		_hashCode = 29 * _hashCode + (int) (temp_costoTotal ^ (temp_costoTotal >>> 32));
		_hashCode = 29 * _hashCode + (costoTotalNull ? 1 : 0);
		_hashCode = 29 * _hashCode + pedidoFacturaIdFactura;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ItemPk
	 */
	public ItemPk createPk()
	{
		return new ItemPk(productoIdProducto, pedidoFacturaIdFactura);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.dto.Item: " );
		ret.append( "productoIdProducto=" + productoIdProducto );
		ret.append( ", cantidad=" + cantidad );
		ret.append( ", costoUnitario=" + costoUnitario );
		ret.append( ", costoTotal=" + costoTotal );
		ret.append( ", pedidoFacturaIdFactura=" + pedidoFacturaIdFactura );
		return ret.toString();
	}

}
