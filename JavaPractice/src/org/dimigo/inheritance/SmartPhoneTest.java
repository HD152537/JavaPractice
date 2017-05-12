/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre> org.dimigo.inheritance
 *    _SmartPhoneTest
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class SmartPhoneTest {
 
	public static void main(String[] args) {
	SmartPhone[] s = { new IPhone("Iphone 7","애플",900000),
					   new Galaxy("갤럭시 s8","삼성",800000) };
	for(SmartPhone value : s)
	{
		System.out.println(value.toString());
		value.turnOn();
		value.pay();
		value.useSpecialFunction(value);
		value.turnOff();
	}
	
 }
}
