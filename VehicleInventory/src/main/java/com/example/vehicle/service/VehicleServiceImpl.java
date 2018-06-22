package com.example.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle.model.Vehicle;
import com.example.vehicle.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;
	
	public VehicleRepository getVehicleRepository() {
		return vehicleRepository;
	}

	public void setVehicleRepository(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public List<Vehicle> getVehicles() {
		return vehicleRepository.findAll();
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteVehicle(Vehicle vehicle) {
		vehicleRepository.delete(vehicle);
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {

	}

	@Override
	public Vehicle getVehicleById(long id) {
		return null;
	}

}
