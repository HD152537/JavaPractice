/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre> org.dimigo.interfaces
 *    _DBTest
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class DBTest {

	public static void main(String[] args) {
		IDBManager s = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		System.out.println("<<변경전>>");
		crud(s);
		IDBManager o = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		System.out.println("<<변경후>>");
		crud(o);
		
	}
	public static void crud(IDBManager database)
	{
		database.insert();
		database.search();
		database.update();
		database.delete();
	}

}
