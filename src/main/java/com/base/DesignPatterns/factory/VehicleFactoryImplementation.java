package com.base.DesignPatterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import com.base.DesignPatterns.factory.constants.VahicleTypeConstants;
import com.base.DesignPatterns.factory.impl.Bicycle;
import com.base.DesignPatterns.factory.impl.Bus;
import com.base.DesignPatterns.factory.impl.Car;
import com.base.DesignPatterns.factory.impl.Motorcycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleFactoryImplementation {

	@Autowired
	private Bus bus;
	@Autowired
	private Bicycle bicycle;
	@Autowired
	private Motorcycle motor;
	@Autowired
	private Car car;

	private static final Map<String, Vahicle> handler = new HashMap<String, Vahicle>();

	@PostConstruct
	private Map<String, Vahicle> getObject() {
		handler.put(VahicleTypeConstants.BICYCLE, bicycle);
		handler.put(VahicleTypeConstants.BUS, bus);
		handler.put(VahicleTypeConstants.MOTORCYCLE, motor);
		handler.put(VahicleTypeConstants.CAR, car);
		return handler;
	}

	public static Vahicle createInstance(String vehicle) throws Exception {
		return Optional.ofNullable(handler.get(vehicle)).orElseThrow(() -> new IllegalArgumentException("Invalid vahicle"));
	}

}
