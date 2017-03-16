/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre> org.dimigo.basic
 *    _Loop
 * 1. 개요 : 초간단 게임 프로그램
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int choice;
		int attack= 100;
		String[] c = {"마법사","영주","기사","농민"};
		
		Scanner scanner = new Scanner(System.in);
				
		do
		{
		System.out.println("--------------");
		System.out.println("<< 게임 메뉴 >>");
		System.out.println("1. 공격력 증가");
		System.out.println("2. 공격력 감소");
		System.out.println("3. 캐릭터 설정");
		System.out.println("9. 종료");
		System.out.println("--------------");
		System.out.println("");
		System.out.printf("메뉴 입력 => ");
		
		choice = scanner.nextInt();
		
		if(choice == 1)
		{
			attack = attack + 10;
			System.out.printf("공격력이 증가되었습니다. 현재공격력: %d\n",attack);
		}
		if(choice == 2)
		{
			attack = attack - 10;
			System.out.printf("공격력이 증가되었습니다. 현재공격력: %d\n",attack);
		}
		if(choice == 3)
		{
			int num = new Random().nextInt(3)+1;
			System.out.println(c[num]+"(으)로 설정되었습니다.");
		}
		if(choice == 9)
		{
			System.out.println("이제 공부하세요!");
		}
		}while(choice != 9);
	}

}
