package com.spring.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CentralController2 {
	
	@Autowired(required = true)
	@Qualifier("c2")
	private RemoteControl control1;
	@Autowired(required = true)
	@Qualifier("c3")
	private RemoteControl control2;
	
	/*
	public CentralController2() {
		
	}


	public CentralController2(RemoteControl control1, RemoteControl control2) {
		super();
		this.control1 = control1;
		this.control2 = control2;
	}
	*/

	public void onAll() {
		System.out.println("��� ������ �մϴ�");	
		control1.on();
		control2.on();
	}
	
	public void offAll() {
		System.out.println("��� ������ ���ϴ�");
		control1.off();
		control2.off();
	}
	/*
	public RemoteControl getControl1() {
		return control1;
	}

	public void setControl1(RemoteControl control1) {
		this.control1 = control1;
	}

	public RemoteControl getControl2() {
		return control2;
	}

	public void setControl2(RemoteControl control2) {
		this.control2 = control2;
	}
	*/

}
