package com.example.vehicle.service;

import java.util.List;

import com.example.vehicle.model.Vehicle;

public interface VehicleService {

	List<Vehicle> getVehicles();
	Vehicle addVehicle(Vehicle vehicle);
	void deleteVehicle(Vehicle vehicle);
	void updateVehicle(Vehicle vehicle);
	Vehicle getVehicleById(long id);
}
