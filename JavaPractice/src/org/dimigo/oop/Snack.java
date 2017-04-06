/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre> org.dimigo.oop
 *    _Snack
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @param name
	 * @param company
	 * @param price
	 * @param number
	 */
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	/**
	 * @param name2
	 * @param company2
	 * @param price2
	 * @param number2
	 * @return 
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + "\n제조사 : " + company + "\n가격 : " + String.format("%,d", price) + "원\n개수 : "+ number +"개\n";
	}
	public int calcPrice()
	{
		return price * number;
	}
	
	
}
