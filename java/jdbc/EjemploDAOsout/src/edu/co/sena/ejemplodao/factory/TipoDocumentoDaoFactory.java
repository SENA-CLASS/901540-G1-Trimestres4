/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.ejemplodao.factory;

import java.sql.Connection;
import edu.co.sena.ejemplodao.dao.*;
import edu.co.sena.ejemplodao.jdbc.*;

public class TipoDocumentoDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return TipoDocumentoDao
	 */
	public static TipoDocumentoDao create()
	{
		return new TipoDocumentoDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return TipoDocumentoDao
	 */
	public static TipoDocumentoDao create(Connection conn)
	{
		return new TipoDocumentoDaoImpl( conn );
	}

}
