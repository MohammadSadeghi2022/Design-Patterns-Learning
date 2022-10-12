package com.base.DesignPatterns.factory.impl;

import org.springframework.stereotype.Component;

import com.base.DesignPatterns.factory.Vahicle;

@Component
public class Car implements Vahicle{

	@Override
	public String specification() {
		return "This is Car with maximum speed of 200km/hr";
	}
}
