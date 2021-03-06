/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre> org.dimigo.inheritance
 *    _SmartPhone
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone()
	{
		
	}
	public SmartPhone(String model, String company, int price)
	{
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn()
	{
		System.out.println(model + "전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println(model + "의 전원을 끕니다.");
	}
	public abstract void pay();
	
	public void useSpecialFunction() // 어차피 자신을 가르켜서 같은 객체를 가르켜도 됨
	{
		if(this instanceof Galaxy)
		{
			((Galaxy)this).useWirelessCharging();
		}
		else if(this instanceof IPhone)
		{
			((IPhone)this).airdrop();
		}
	}
	public String toString()
	{
		return "모델명 : " + model +", 제조사 : "+ company + ",가격 : " + String.format("%,d", price);
	}
}
