package com.spring.di;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CentralController centralController = new CentralController();
		while(true) {
			System.out.println("1. ������ �߰�");
			System.out.println("2. ��� ���� �ѱ�");
			System.out.println("3. ��� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("����� ������ �ּ���: ");
			int select = in.nextInt();
			in.nextLine();
			
			if(select == 1) {
				centralController.addController();
			}else if(select == 2) {
				centralController.onAll();
			}else if(select == 3) {
				centralController.offAll();
			}else if(select == 0) {
				System.out.println("���α׷� ������...");
				break;
			}else {
				System.out.println("�� �� �� ��ɾ� �Դϴ�.");
			}
		}
		
		
	}

}
