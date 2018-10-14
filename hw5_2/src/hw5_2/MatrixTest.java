package hw5_2;



public class MatrixTest {
	public static void main(String[] args) {
		System.out.println("hw5_2: 윤성현 ");

		//***************************
		 // 파일명: MatrixTest.java
		 // 작성자: 윤성현
		 // 작성일: 2018-09-20
		 // 설명:순차 자료구조 사용을 익힌다.
		 //***************************

		int[][] x = {
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4},
				{4, 4, 4, 4, 4, 4}
		};

		int[][] y = {
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2, 2}
		};

		int[][] z = MyMatrixService.multiply(x,  y);
		MyMatrixService.print(z);
		System.out.println();


		int[][] a = {
				{1, 1, 1},
				{2, 2, 2},
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] b = {
				{1, 1, 1, 1, -3},
				{1, 2, 3, 4, 5},
				{-2, 0, 6, 9, 12}
		};

		int[][] c = MyMatrixService.multiply(a,  b);
		MyMatrixService.print(c);
	}
}




