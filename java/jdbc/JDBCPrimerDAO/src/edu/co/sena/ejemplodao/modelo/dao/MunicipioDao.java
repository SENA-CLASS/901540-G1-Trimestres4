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

public interface MunicipioDao
{
	/** 
	 * Inserts a new row in the municipio table.
	 */
	public MunicipioPk insert(Municipio dto) throws MunicipioDaoException;

	/** 
	 * Updates a single row in the municipio table.
	 */
	public void update(MunicipioPk pk, Municipio dto) throws MunicipioDaoException;

	/** 
	 * Deletes a single row in the municipio table.
	 */
	public void delete(MunicipioPk pk) throws MunicipioDaoException;

	/** 
	 * Returns the rows from the municipio table that matches the specified primary-key value.
	 */
	public Municipio findByPrimaryKey(MunicipioPk pk) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ID_MUNICIPIO = :idMunicipio'.
	 */
	public Municipio findByPrimaryKey(int idMunicipio) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria ''.
	 */
	public Municipio[] findAll() throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'DEPARTAMENTO_ID_DEPARTAMENTO = :departamentoIdDepartamento'.
	 */
	public Municipio[] findByDepartamento(int departamentoIdDepartamento) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'ID_MUNICIPIO = :idMunicipio'.
	 */
	public Municipio[] findWhereIdMunicipioEquals(int idMunicipio) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'NOMNBRE_MUNICIPIO = :nomnbreMunicipio'.
	 */
	public Municipio[] findWhereNomnbreMunicipioEquals(String nomnbreMunicipio) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the criteria 'DEPARTAMENTO_ID_DEPARTAMENTO = :departamentoIdDepartamento'.
	 */
	public Municipio[] findWhereDepartamentoIdDepartamentoEquals(int departamentoIdDepartamento) throws MunicipioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicSelect(String sql, Object[] sqlParams) throws MunicipioDaoException;

	/** 
	 * Returns all rows from the municipio table that match the specified arbitrary SQL statement
	 */
	public Municipio[] findByDynamicWhere(String sql, Object[] sqlParams) throws MunicipioDaoException;

}