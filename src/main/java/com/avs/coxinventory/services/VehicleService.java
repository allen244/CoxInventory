package com.avs.coxinventory.services;

import com.avs.coxinventory.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> getAllVehicles();

    List<Vehicle> findByMake(String id);

    List<Vehicle> findByMakeAndModel(String make, String model);

    List<Vehicle> findByMakeAndModelaAndYear(String make, String model, int year);

    List<Vehicle> findByMakeAndVehicleTypes(String make, String type);

    Vehicle saveVehicle(Vehicle vehicle);

    void deleteById(Long id);


}
