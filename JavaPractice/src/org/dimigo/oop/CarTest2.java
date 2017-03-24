/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>    
 *
 * 1. 개요  :	자동차 출력
 * 2. 작성일  :  2017. 3. 23.
 * </pre>
 *
 * @author  : 최정우
 * @version : 1.0
 */
public class CarTest2 {

	   /**
	    * @param args
	    */
	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      //class object declare
	      Car2 car1 = new Car2("현대자동차","제네시스","검정색",225,50000000);
	      Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
	      Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
	      
	      System.out.println("<< 자동차 목록 >>");
	      System.out.println("제조사명 : " + car1.company);
	      System.out.println("모델명 : " + car1.model);
	      System.out.println("색상 : " + car1.color);
	      System.out.println("최대속도 : " + car1.maxspeed + "km");
	      System.out.println("가격 : " + String.format("%,d", car1.price));
	      System.out.println();
	      
	      System.out.println("제조사명 : " + car2.company);
	      System.out.println("모델명 : " + car2.model);
	      System.out.println("색상 : " + car2.color);
	      System.out.println("최대속도 : " + car2.maxspeed + "km");
	      System.out.println("가격 : " + String.format("%,d", car2.price));
	      System.out.println();
	      
	      System.out.println("제조사명 : " + car3.company);
	      System.out.println("모델명 : " + car3.model);
	      System.out.println("색상 : " + car3.color);
	      System.out.println("최대속도 : " + car3.maxspeed + "km");
	      System.out.println("가격 : " + String.format("%,d", car3.price));
	   }
}
