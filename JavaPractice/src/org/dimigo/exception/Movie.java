/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre> org.dimigo.exception
 *    _Movie
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 5. 29.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title,int limitAge)
	{
		this.title = title;
		this.limitAge = limitAge;
	}
	public String getTitle() {
		return title;
	}
	public int getLimitAge() {
		return limitAge;
	}
	public void buyticket(int age) throws Exception 
	{
	
		if(age < this.limitAge)
		{
			throw new Exception(this.title+" 은/는 "+ this.limitAge + "세 이상 관람가입니다.");
		}
		else
		{
			System.out.println(this.title + " 즐감하세요.");
		}
	}
}
