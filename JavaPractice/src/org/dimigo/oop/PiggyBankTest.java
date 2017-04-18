/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre> org.dimigo.oop
 *    _PiggyBankTest
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */
public class PiggyBankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember[] family = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(family[0],10000);
		PiggyBank.putMoney(family[1],5000);
		PiggyBank.putMoney(family[2],2000);
		PiggyBank.putMoney(family[3],1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2],1000);
		PiggyBank.printBalance();
	}

}
