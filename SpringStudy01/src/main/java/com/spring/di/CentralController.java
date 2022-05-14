package com.spring.di;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentralController {
	
	private List<RemoteControl> controls;
	private Scanner in;
	
	public CentralController() {
		controls = new ArrayList<RemoteControl>();
		in = new Scanner(System.in);
	}
	
	public void addController() {
		RemoteControl remoteControl;
		
		
		System.out.println("ȸ����� �Է��� �ּ���: ");
		String company = in.nextLine();
		while(true) {
			System.out.println("�������� ������ ������ �ּ���: ");
			int remote = in.nextInt();
			in.nextLine();		
			if(remote == 1) {
				// TV
				remoteControl = new TvRemoteControl(company);
				break;
			} else if(remote == 2) {
				// ������
				remoteControl = new AirConditionerRemoteControl(company);
				break;
			} else {
				System.out.println("�������� �ʴ� �������Դϴ�.");
			}
		}
		controls.add(remoteControl);
	}

	public void onAll() {
		System.out.println("��� ������ �մϴ�");
		for (RemoteControl control : controls) {
			control.on();
		}
	}
	
	public void offAll() {
		System.out.println("��� ������ ���ϴ�");
		for (RemoteControl control : controls) {
			control.off();
		}
	}
	

}
