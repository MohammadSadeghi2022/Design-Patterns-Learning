package com.base.DesignPatterns.factory.impl;

import org.springframework.stereotype.Component;

import com.base.DesignPatterns.factory.Vahicle;

@Component
public class Motorcycle implements Vahicle {

	@Override
	public String specification() {
		return "This is MotorCycle with maximum speed of 400km/hr";
	}

}
