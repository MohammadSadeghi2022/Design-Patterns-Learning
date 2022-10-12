package com.base.DesignPatterns.factory.impl;

import org.springframework.stereotype.Component;

import com.base.DesignPatterns.factory.Vahicle;

@Component
public class Bus implements Vahicle {

	@Override
	public String specification() {
		return "This is Bus with maximum speed of 150km/hr";
	}

}
