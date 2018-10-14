package hw5_1;

public class MyArrayList {

	// ***************************
	// 파일명:MyArrayList.java
	// 작성자:윤성현
	// 작성일: 2018.09.19
	// 설명:순차자료구조 연산 구현을 연습한다.
	// ***************************

	private int[] arr;
	private int num;
	private int x;

	public MyArrayList() {
		this.x = 10;
		this.arr = new int[x];
		this.num = 0;

	}

	public boolean add(int a) {
		if (num < 10)
			this.arr[num++] = a;
		else
		{
			int[] otherArr = this.arr;
			this.x = 2*this.x;
			this.arr = new int[x];
			for(int i=0; i<num;i++)
			{
				arr[i] = otherArr[i];
			}
			this.arr[num++] = a;
		}
		return true;
	}

	public void add(int index, int element) {
		// TODO Auto-generated method stub
		for(int i=num; i>=index+1; i--)
		{

			arr[i] = arr[i-1];


		}
		arr[index]=element;
		num++;

	}

	public int get(int a) {
		return arr[a];
	}

	public int remove(int index) {
		// TODO Auto-generated method stub
		int element = arr[index];
		for(int i=index;i<num;i++)
		{
			System.out.println(arr[i]+","+arr[i+1]);
			arr[i]=arr[i+1];
		}
		num--;
		return element;
	}

	public int size() {
		return num;
	}

	@Override
	public String toString() {
		String str = "list = ";
		for (int i = 0; i < num; i++) {
			str = str.concat(Integer.toString(arr[i]) + " ");
		}
		return str;
	}

}
