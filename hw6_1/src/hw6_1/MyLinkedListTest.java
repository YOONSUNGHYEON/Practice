package hw6_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//***************************
		// 파일명: MyLinkedListTest.java
		// 작성자: 윤성현
		// 작성일: 2018.10.2
		// 설명:단순 연결리스트 연산을 구현한다.
		//***************************

		System.out.println("hw6_1:윤성현");

		MyLinkedList list = new MyLinkedList();
		Scanner input = new Scanner(System.in);

		int menu = 0;
		int index = 0;
		int element = 0;
		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());   // 완성하세요.
				break;
			case 2:
				System.out.println("리스트 길이를 조회합니다.");
				int size = list.size();  // 완성하세요.
				System.out.println(size);
				break;
			case 3:
				System.out.println("원소를 리스트의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.addFirst(element);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.addLast(element); // 완성하세요.
				break;
			case 5:
				System.out.println("리스트의 맨 앞의 원소를 삭제합니다.");
				element = list.removeFirst();  // 완성하세요.
				System.out.println(element);
				break;
			case 6:
				System.out.println("리스트의 맨 뒤의 원소를 삭제합니다.");
				element = list.removeLast();  // 완성하세요.
				System.out.println(element);
				break;
			case 7:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);
	}
}



