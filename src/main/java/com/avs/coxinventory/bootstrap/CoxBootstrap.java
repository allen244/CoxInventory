package com.avs.coxinventory.bootstrap;

import com.avs.coxinventory.domain.Color;
import com.avs.coxinventory.domain.FuelTypes;
import com.avs.coxinventory.domain.Vehicle;
import com.avs.coxinventory.domain.VehicleTypes;
import com.avs.coxinventory.repositories.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class CoxBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    VehicleRepository vehicleRepository;

    @Autowired
    public void setVehicleRepository(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    private List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle v1 = new Vehicle();
        v1.setMake("nissan");
        v1.setModel("maxima");
        v1.setYear(2018);
        v1.setPrice(30000);
        v1.setMsrp(28000);
        v1.setVin("123saaaa");
        v1.setFuelTypes(FuelTypes.GAS);
        v1.setColor(Color.BLACK);
        v1.setMileage(0);
        v1.setVehicleTypes(VehicleTypes.Sedan.toString());
        vehicles.add(v1);


        Vehicle v2 = new Vehicle();
        v2.setMake("nissan");
        v2.setModel("maxima");
        v2.setYear(2018);
        v2.setPrice(31000);
        v2.setMsrp(28000);
        v2.setVin("123saaaa");
        v2.setFuelTypes(FuelTypes.GAS);
        v2.setColor(Color.WHITE);
        v2.setMileage(0);
        v2.setVehicleTypes(VehicleTypes.Sedan.toString());
        vehicles.add(v2);





        Vehicle v3 = new Vehicle();
        v3.setMake("nissan");
        v3.setModel("maxima");
        v3.setYear(2017);
        v3.setPrice(30000);
        v3.setMsrp(28000);
        v3.setVin("123saaaa");
        v3.setFuelTypes(FuelTypes.GAS);
        v3.setColor(Color.BLACK);
        v3.setMileage(0);
        v3.setVehicleTypes(VehicleTypes.Sedan.toString());
        vehicles.add(v3);


        Vehicle v4 = new Vehicle();
        v4.setMake("nissan");
        v4.setModel("maxima");
        v4.setYear(2017);
        v4.setPrice(31000);
        v4.setMsrp(28000);
        v4.setVin("123saaaa");
        v4.setFuelTypes(FuelTypes.GAS);
        v4.setColor(Color.WHITE);
        v4.setMileage(0);
        v4.setVehicleTypes(VehicleTypes.Sedan.toString());
        vehicles.add(v4);



        Vehicle v5 = new Vehicle();
        v5.setMake("nissan");
        v5.setModel("ultima");
        v5.setYear(2017);
        v5.setPrice(20200);
        v5.setMsrp(18000);
        v5.setVin("123saaaa");
        v5.setFuelTypes(FuelTypes.GAS);
        v5.setColor(Color.BLACK);
        v5.setMileage(0);
        v5.setVehicleTypes(VehicleTypes.Sedan.toString());
        vehicles.add(v5);


        Vehicle v6 = new Vehicle();
        v6.setMake("nissan");
        v6.setModel("ultima");
        v6.setYear(2018);
        v6.setPrice(22000);
        v6.setMsrp(18000);
        v6.setVin("123saaaa");
        v6.setFuelTypes(FuelTypes.GAS);
        v6.setColor(Color.WHITE);
        v6.setMileage(0);
        v6.setVehicleTypes(VehicleTypes.Sedan.toString());
        vehicles.add(v6);



        Vehicle v8 = new Vehicle();
        v8.setMake("nissan");
        v8.setModel("GT-R");
        v8.setYear(2017);
        v8.setPrice(20200);
        v8.setMsrp(18000);
        v8.setVin("123saaaa");
        v8.setFuelTypes(FuelTypes.GAS);
        v8.setColor(Color.BLACK);
        v8.setMileage(0);
        v8.setVehicleTypes(VehicleTypes.Sports_Car.toString());
        vehicles.add(v8);


        Vehicle v7 = new Vehicle();
        v7.setMake("nissan");
        v7.setModel("pathfinder");
        v7.setYear(2018);
        v7.setPrice(40000);
        v7.setMsrp(18000);
        v7.setVin("123saaaa");
        v7.setFuelTypes(FuelTypes.GAS);
        v7.setColor(Color.WHITE);
        v7.setMileage(0);
        v7.setVehicleTypes(VehicleTypes.Suv.toString());
        vehicles.add(v7);



        //vehicleRepository.findByMakeAndVehicleTypesIgnoreCase("nissan", "sedan");
        return vehicles;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        vehicleRepository.saveAll(getVehicles());
        log.debug("loading bootstrap");

    }
}
