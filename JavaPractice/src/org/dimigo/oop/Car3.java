/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre> org.dimigo.oop
 *    _Car
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Car3 {
	   
	public static String company;
	public String model;
	public String color;
	public int maxspeed;
	public int price;
	
	// 필요한 경우 다양한 생성자를 만들수 있음.
	public Car3(String company, String model, String color, int maxspeed,int price)
	{
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxspeed)
	{
		this(company,model,color,maxspeed,0);
	}
	public Car3(String company, String model, String color)
	{
		this(company,model,color,0,0);
	}
}
