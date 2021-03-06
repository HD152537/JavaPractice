/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre> org.dimigo.interfaces
 *    _SybaseDB
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class SybaseDB implements IDBManager {

	
	@Override
	public void insert() {
		System.out.println("SybaseDB 저장");
	}
	@Override
	public void search() {
		System.out.println("SybaseDB 조회");
	}
	@Override
	public void update() {
		System.out.println("SybaseDB 변경");
	}
	@Override
	public void delete() {
		System.out.println("SybaseDB 삭제");
	}
}
