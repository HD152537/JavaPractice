/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre> org.dimigo.basic
 *    _Operator
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salory = 1700000;
		int staff = 3;
		int store = 1500;
		long money = ((long)salory * 12 * staff * store); 
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", salory)+"원");
		System.out.printf("점포 내 직원 수 : %d명\n",staff);		
		System.out.printf("점포 수 : %d개\n\n",store);		
		System.out.println("연간 인건비 : "+ String.format("%,d", money)+"원");
	}

}
