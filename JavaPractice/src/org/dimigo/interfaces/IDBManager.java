/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre> org.dimigo.interfaces
 *    _IDBManager
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database)
	{
		IDBManager idbm = null;
		
		if(ORACLE_DATABASE.equals(database))
		{
			idbm = new OracleDB();
		}
		if(SYBASE_DATABASE.equals(database))
		{
			idbm = new SybaseDB();
		}
		return idbm;
	}
	
}
