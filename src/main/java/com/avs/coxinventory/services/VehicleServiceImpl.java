package com.avs.coxinventory.services;

import com.avs.coxinventory.domain.Vehicle;
import com.avs.coxinventory.domain.VehicleTypes;
import com.avs.coxinventory.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicleRepository.findAll().forEach(vehicles::add);
        return vehicles;
    }

    @Override
    public List<Vehicle> findByMake(String make) {
        return vehicleRepository.findByMakeIgnoreCase(make);
    }

    @Override
    public List<Vehicle> findByMakeAndModel(String make, String model) {
        return vehicleRepository.findByMakeAndModelIgnoreCase(make, model);
    }

    @Override
    public List<Vehicle> findByMakeAndModelaAndYear(String make, String model, int year) {
        return vehicleRepository.findByMakeAndModelAndYear(make, model, year);
    }

    @Override
    public List<Vehicle> findByMakeAndVehicleTypes(String make, String type) {
        return vehicleRepository.findByMakeAndVehicleTypesIgnoreCase(make, type);
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteById(Long id) {
        vehicleRepository.deleteById(id);
    }
}
