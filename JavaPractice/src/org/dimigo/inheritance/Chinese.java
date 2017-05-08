/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre> org.dimigo.inheritance
 *    _Chinese
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Chinese extends Person {
	public Chinese(String name)
	{
		super(name);
	}
	public void sayHello()
	{
		System.out.println("니하오");
	}
	public void sayBye()
	{
		System.out.println("짜이찌엔");
	}
	public String toString()
	{
		return "저는 " + "중국사람 "+ getName() + " 입니다.\n";
	}
}
