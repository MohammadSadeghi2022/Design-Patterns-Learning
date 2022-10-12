package com.base.DesignPatterns.factory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {

	// private static final Logger Log = LoggerFactory.getLogger(FactoryController.class);

	@GetMapping("/bse/vehicle/{vehicle-type}")//bus-type
	public String getVehicleTypeInfo(@PathVariable("vehicle-type") String vehicle) throws Exception {

		Vahicle vahicleFactory = VehicleFactoryImplementation.createInstance(vehicle);
		return vahicleFactory.specification();

	}

}
