package com.example.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.model.Vehicle;
import com.example.vehicle.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@GetMapping
	public List<Vehicle> getVehicles(){
		
		return vehicleService.getVehicles();
	}
	
	@PostMapping
	public Vehicle addVehicle(Vehicle vehicle) {
		
		return vehicleService.addVehicle(vehicle);
	}
	
	@PutMapping
	public void updateVehicle(Vehicle vehicle) {
		vehicleService.updateVehicle(vehicle);
	}
	
	@DeleteMapping
	public void deleteVehicle(Vehicle vehicle) {
		vehicleService.deleteVehicle(vehicle);
	}

	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
}
