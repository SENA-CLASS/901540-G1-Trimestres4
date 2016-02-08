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

public class Departamento implements Serializable
{
	/** 
	 * This attribute maps to the column ID_DEPARTAMENTO in the departamento table.
	 */
	protected int idDepartamento;

	/** 
	 * This attribute maps to the column NOMBRE_DEPARTAMENTO in the departamento table.
	 */
	protected String nombreDepartamento;

	/**
	 * Method 'Departamento'
	 * 
	 */
	public Departamento()
	{
	}

	/**
	 * Method 'getIdDepartamento'
	 * 
	 * @return int
	 */
	public int getIdDepartamento()
	{
		return idDepartamento;
	}

	/**
	 * Method 'setIdDepartamento'
	 * 
	 * @param idDepartamento
	 */
	public void setIdDepartamento(int idDepartamento)
	{
		this.idDepartamento = idDepartamento;
	}

	/**
	 * Method 'getNombreDepartamento'
	 * 
	 * @return String
	 */
	public String getNombreDepartamento()
	{
		return nombreDepartamento;
	}

	/**
	 * Method 'setNombreDepartamento'
	 * 
	 * @param nombreDepartamento
	 */
	public void setNombreDepartamento(String nombreDepartamento)
	{
		this.nombreDepartamento = nombreDepartamento;
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
		
		if (!(_other instanceof Departamento)) {
			return false;
		}
		
		final Departamento _cast = (Departamento) _other;
		if (idDepartamento != _cast.idDepartamento) {
			return false;
		}
		
		if (nombreDepartamento == null ? _cast.nombreDepartamento != nombreDepartamento : !nombreDepartamento.equals( _cast.nombreDepartamento )) {
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
		_hashCode = 29 * _hashCode + idDepartamento;
		if (nombreDepartamento != null) {
			_hashCode = 29 * _hashCode + nombreDepartamento.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DepartamentoPk
	 */
	public DepartamentoPk createPk()
	{
		return new DepartamentoPk(idDepartamento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.ejemplodao.modelo.dto.Departamento: " );
		ret.append( "idDepartamento=" + idDepartamento );
		ret.append( ", nombreDepartamento=" + nombreDepartamento );
		return ret.toString();
	}

}
