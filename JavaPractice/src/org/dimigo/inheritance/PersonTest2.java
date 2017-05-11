/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre> org.dimigo.inheritance
 *    _PersonTest
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = {
				new Person("Tom"),
				new Person("홍길동"),
				new Person("다나카"),
				new Person("왕밍")
		};
		greeting(p);
	}
	public static void greeting(Person[] p)
	{
		for(Person value : p)
		{
			System.out.println(value);
			value.sayHello();
			value.sayBye();
		}
	}
}
