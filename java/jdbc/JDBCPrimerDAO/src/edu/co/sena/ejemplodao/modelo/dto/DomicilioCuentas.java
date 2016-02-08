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

public class DomicilioCuentas implements Serializable
{
	/** 
	 * This attribute maps to the column DIRECCION in the domicilio_cuentas table.
	 */
	protected String direccion;

	/** 
	 * This attribute maps to the column TELEFONO in the domicilio_cuentas table.
	 */
	protected String telefono;

	/** 
	 * This attribute maps to the column BARRIO in the domicilio_cuentas table.
	 */
	protected String barrio;

	/** 
	 * This attribute maps to the column LOCALIDAD in the domicilio_cuentas table.
	 */
	protected String localidad;

	/** 
	 * This attribute maps to the column CORREO_POSTAL in the domicilio_cuentas table.
	 */
	protected String correoPostal;

	/** 
	 * This attribute maps to the column MUNICIPIO_ID_MUNICIPIO in the domicilio_cuentas table.
	 */
	protected int municipioIdMunicipio;

	/** 
	 * This attribute maps to the column CUENTA_TIPO_DOCUMENTO_TIPO_DOCUMENTO in the domicilio_cuentas table.
	 */
	protected String cuentaTipoDocumentoTipoDocumento;

	/** 
	 * This attribute maps to the column CUENTA_NUMERO_DOCUMENTO in the domicilio_cuentas table.
	 */
	protected String cuentaNumeroDocumento;

	/**
	 * Method 'DomicilioCuentas'
	 * 
	 */
	public DomicilioCuentas()
	{
	}

	/**
	 * Method 'getDireccion'
	 * 
	 * @return String
	 */
	public String getDireccion()
	{
		return direccion;
	}

	/**
	 * Method 'setDireccion'
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

	/**
	 * Method 'getTelefono'
	 * 
	 * @return String
	 */
	public String getTelefono()
	{
		return telefono;
	}

	/**
	 * Method 'setTelefono'
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	/**
	 * Method 'getBarrio'
	 * 
	 * @return String
	 */
	public String getBarrio()
	{
		return barrio;
	}

	/**
	 * Method 'setBarrio'
	 * 
	 * @param barrio
	 */
	public void setBarrio(String barrio)
	{
		this.barrio = barrio;
	}

	/**
	 * Method 'getLocalidad'
	 * 
	 * @return String
	 */
	public String getLocalidad()
	{
		return localidad;
	}

	/**
	 * Method 'setLocalidad'
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad)
	{
		this.localidad = localidad;
	}

	/**
	 * Method 'getCorreoPostal'
	 * 
	 * @return String
	 */
	public String getCorreoPostal()
	{
		return correoPostal;
	}

	/**
	 * Method 'setCorreoPostal'
	 * 
	 * @param correoPostal
	 */
	public void setCorreoPostal(String correoPostal)
	{
		this.correoPostal = correoPostal;
	}

	/**
	 * Method 'getMunicipioIdMunicipio'
	 * 
	 * @return int
	 */
	public int getMunicipioIdMunicipio()
	{
		return municipioIdMunicipio;
	}

	/**
	 * Method 'setMunicipioIdMunicipio'
	 * 
	 * @param municipioIdMunicipio
	 */
	public void setMunicipioIdMunicipio(int municipioIdMunicipio)
	{
		this.municipioIdMunicipio = municipioIdMunicipio;
	}

	/**
	 * Method 'getCuentaTipoDocumentoTipoDocumento'
	 * 
	 * @return String
	 */
	public String getCuentaTipoDocumentoTipoDocumento()
	{
		return cuentaTipoDocumentoTipoDocumento;
	}

	/**
	 * Method 'setCuentaTipoDocumentoTipoDocumento'
	 * 
	 * @param cuentaTipoDocumentoTipoDocumento
	 */
	public void setCuentaTipoDocumentoTipoDocumento(String cuentaTipoDocumentoTipoDocumento)
	{
		this.cuentaTipoDocumentoTipoDocumento = cuentaTipoDocumentoTipoDocumento;
	}

	/**
	 * Method 'getCuentaNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getCuentaNumeroDocumento()
	{
		return cuentaNumeroDocumento;
	}

	/**
	 * Method 'setCuentaNumeroDocumento'
	 * 
	 * @param cuentaNumeroDocumento
	 */
	public void setCuentaNumeroDocumento(String cuentaNumeroDocumento)
	{
		this.cuentaNumeroDocumento = cuentaNumeroDocumento;
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
		
		if (!(_other instanceof DomicilioCuentas)) {
			return false;
		}
		
		final DomicilioCuentas _cast = (DomicilioCuentas) _other;
		if (direccion == null ? _cast.direccion != direccion : !direccion.equals( _cast.direccion )) {
			return false;
		}
		
		if (telefono == null ? _cast.telefono != telefono : !telefono.equals( _cast.telefono )) {
			return false;
		}
		
		if (barrio == null ? _cast.barrio != barrio : !barrio.equals( _cast.barrio )) {
			return false;
		}
		
		if (localidad == null ? _cast.localidad != localidad : !localidad.equals( _cast.localidad )) {
			return false;
		}
		
		if (correoPostal == null ? _cast.correoPostal != correoPostal : !correoPostal.equals( _cast.correoPostal )) {
			return false;
		}
		
		if (municipioIdMunicipio != _cast.municipioIdMunicipio) {
			return false;
		}
		
		if (cuentaTipoDocumentoTipoDocumento == null ? _cast.cuentaTipoDocumentoTipoDocumento != cuentaTipoDocumentoTipoDocumento : !cuentaTipoDocumentoTipoDocumento.equals( _cast.cuentaTipoDocumentoTipoDocumento )) {
			return false;
		}
		
		if (cuentaNumeroDocumento == null ? _cast.cuentaNumeroDocumento != cuentaNumeroDocumento : !cuentaNumeroDocumento.equals( _cast.cuentaNumeroDocumento )) {
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
		if (direccion != null) {
			_hashCode = 29 * _hashCode + direccion.hashCode();
		}
		
		if (telefono != null) {
			_hashCode = 29 * _hashCode + telefono.hashCode();
		}
		
		if (barrio != null) {
			_hashCode = 29 * _hashCode + barrio.hashCode();
		}
		
		if (localidad != null) {
			_hashCode = 29 * _hashCode + localidad.hashCode();
		}
		
		if (correoPostal != null) {
			_hashCode = 29 * _hashCode + correoPostal.hashCode();
		}
		
		_hashCode = 29 * _hashCode + municipioIdMunicipio;
		if (cuentaTipoDocumentoTipoDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaTipoDocumentoTipoDocumento.hashCode();
		}
		
		if (cuentaNumeroDocumento != null) {
			_hashCode = 29 * _hashCode + cuentaNumeroDocumento.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DomicilioCuentasPk
	 */
	public DomicilioCuentasPk createPk()
	{
		return new DomicilioCuentasPk(cuentaTipoDocumentoTipoDocumento, cuentaNumeroDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.modelo.dto.DomicilioCuentas: " );
		ret.append( "direccion=" + direccion );
		ret.append( ", telefono=" + telefono );
		ret.append( ", barrio=" + barrio );
		ret.append( ", localidad=" + localidad );
		ret.append( ", correoPostal=" + correoPostal );
		ret.append( ", municipioIdMunicipio=" + municipioIdMunicipio );
		ret.append( ", cuentaTipoDocumentoTipoDocumento=" + cuentaTipoDocumentoTipoDocumento );
		ret.append( ", cuentaNumeroDocumento=" + cuentaNumeroDocumento );
		return ret.toString();
	}

}
