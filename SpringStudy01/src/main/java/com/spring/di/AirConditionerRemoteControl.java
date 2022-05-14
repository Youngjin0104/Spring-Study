package com.spring.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c3")
public class AirConditionerRemoteControl implements RemoteControl {
	
	@Value("SAMSUNG")
	private String company;

	public AirConditionerRemoteControl() {
	}

	public AirConditionerRemoteControl(String company) {
	super();
	this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void on() {
		System.out.println(company + "�������� ������ �մϴ�.");
		
	}

	@Override
	public void off() {
		System.out.println(company + "�������� ������ ���ϴ�.");
		
	}

}
