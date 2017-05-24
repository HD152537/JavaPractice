/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre> org.dimigo.interfaces
 *    _OracleDB
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class OracleDB implements IDBManager {


	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB 저장");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB 조회");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB 변경");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("OracleDB 삭제");
	}



}
