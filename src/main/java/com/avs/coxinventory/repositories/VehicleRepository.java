package com.avs.coxinventory.repositories;

import com.avs.coxinventory.domain.Vehicle;
import com.avs.coxinventory.domain.VehicleTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

    List<Vehicle> findByMakeIgnoreCase(String make);

    List<Vehicle> findByMakeAndModelIgnoreCase(String make, String model);

    List<Vehicle> findByMakeAndModelAndYear(String make, String model, int year);

    List<Vehicle> findByMakeAndVehicleTypesIgnoreCase(String make, String type);
}
