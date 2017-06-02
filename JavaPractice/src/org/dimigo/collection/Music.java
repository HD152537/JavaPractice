/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre> org.dimigo.collection
 *    _Music
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Music {
	private String title;
	private String singer;
	
	public Music(String title, String singer)
	{
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getsinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String toString()
	{
		return title + "(" + singer + ")";
	}
}
