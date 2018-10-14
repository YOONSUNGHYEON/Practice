package hw5_2;

public class MyMatrixService {



	public static int[][] multiply(int[][] x, int[][] y) {
		// TODO Auto-generated method stub
		int[][] z = new int[x.length][y[0].length];
		for(int k=0; k<x.length; k++) {
			for(int i=0; i<y[0].length; i++) {
				int sum = 0;
				for(int j=0; j<y.length; j++) {
					int num = x[k][j]*y[j][i];
					sum += num;

				}
				z[k][i] = sum;
			}
		}
		return z;
	}


	public static void print(int[][] z) {
		// TODO Auto-generated method stub
		for(int i=0; i<z.length; i++) {
			for(int j=0; j<z[0].length; j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
	}

























}
