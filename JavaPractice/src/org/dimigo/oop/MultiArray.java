/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre> org.dimigo.oop
 *    _MultiArray
 * 1. 개요 : 이것은 정우가 짠 코드
 * 2. 작성일 : 2017. 4. 7.
 * </pre>
 *
 * #author : &{user}
 * @version : 1.0
 */

public class MultiArray {


	public void printArr(int[][] intArr)
	{
		for(int i=0; i < intArr.length; i++)
		{
			for(int j=0;j < intArr[i].length; j++)
			{
				System.out.print(intArr[i][j] + "|");
			}
			System.out.println();
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArr = new int[2][3];
		MultiArray obj = new MultiArray();
		obj.printArr(intArr);
		
		intArr[0][2] = 1;
		obj.printArr(intArr);
		
		intArr[1][2] = 2;
		obj.printArr(intArr);
		
		String[][] strArr = new String[2][];
//		strArr[1][0]= "1"; // 배열안에 있는 null에 행위를 했음ㅁ
		strArr[0] = new String[3];
		strArr[1] = new String[2];
		
		obj.printArr(strArr);
		
		strArr[0][0] = "디미고";
		strArr[0][1] = "구보";
		strArr[0][2] = "선린고";
		strArr[1][0] = "무단외출";
		strArr[1][1] = "야외점호";
		obj.printArr(strArr);
		
		int[][] intArr2 =
			{
					{1,2,3},
					{4,5,6}
			};
		obj.printArr(intArr2);
		
		int[][] intArr3 =
			{
					new int[]{1,2,3},
					new int[]{4,5,6}
			};
		obj.printArr(intArr3);
		
		int[][] intArr4 = new int[][]
			{
					new int[]{1,2,3},
					new int[]{4,5,6}
			};
		obj.printArr(intArr4);
		int[][] intArr5 = new int[][]
			{
					{1,2,3},
					{4,5,6}
			};
		obj.printArr(intArr5); 
		
		int[][] intArr6 = null;
		intArr6 = new int[][]{
			new int[]{1,2,3},
			{1,2,3}
		};
		obj.printArr(intArr6); 
	}


	/**
	 * @param strArr
	 */
	void printArr(String[][] strArr) {
		// TODO Auto-generated method stub
		for(int i=0; i < strArr.length; i++)
		{
			for(int j=0;j < strArr[i].length; j++)
			{
				System.out.print(strArr[i][j] + "|");
			}
			System.out.println();
		}
	}
}
