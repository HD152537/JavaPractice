/**
 * 
 */
package org.dimigo.oop;

import java.util.*;

/**
 * <pre> org.dimigo.oop
 *    _Question
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] questions = {"가장 좋아하는 가수는? ","가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
		String[] answers = {"모모","이성경","응용 프로그래밍"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			System.out.printf("%s\n",questions[i]);
			String answer = scanner.nextLine();
			
			if(answers[i].equals(answer))
			{
				System.out.println("정답입니다!");
			}
			else
			{
				System.out.println("틀렸습니다!");
			}
		}
		System.out.println("<<결과출력>>");
		
		for(int i=0;i<3;i++)
		{
			StringBuilder sb = new StringBuilder(questions[i]);
			
			System.out.println(sb.append(answers[i]).append("입니다."));
		}
	}

}
