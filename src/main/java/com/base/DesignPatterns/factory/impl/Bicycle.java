package com.base.DesignPatterns.factory.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.base.DesignPatterns.factory.Vahicle;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Bicycle implements Vahicle{

	@Override
	public String specification() {
		return "This is Bicycle and the speed depends on the way you ride it";
	}

	public String findById(long id){

		return "id 1111";
	}
}
