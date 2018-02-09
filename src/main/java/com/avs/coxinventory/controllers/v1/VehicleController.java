package com.avs.coxinventory.controllers.v1;

import com.avs.coxinventory.domain.Vehicle;
import com.avs.coxinventory.domain.VehicleTypes;
import com.avs.coxinventory.model.VehicleListDTO;
import com.avs.coxinventory.services.VehicleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles/")
public class VehicleController {

    VehicleService vehicleService;

    @Autowired
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @ApiOperation(value = "View List of Vehicles", notes = "API Notes")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public VehicleListDTO getAllVehicles() {
        return new VehicleListDTO(vehicleService.getAllVehicles());
    }

    @GetMapping("{make}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleListDTO getVehicleByMake(@PathVariable String make) {
        return new VehicleListDTO(vehicleService.findByMake(make));

    }

    @GetMapping("{make}/{model}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleListDTO getVehicleByMakeAndModel(@PathVariable String make, @PathVariable String model) {
        return new VehicleListDTO(vehicleService.findByMakeAndModel(make, model));

    }

    @GetMapping("{make}/{model}/{year}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleListDTO getVehicleByMakeAndModelAndYear(@PathVariable String make, @PathVariable String model, @PathVariable String year) {
        return new VehicleListDTO(vehicleService.findByMakeAndModelaAndYear(make, model, new Integer(year)));
    }

    @GetMapping("/type/{make}/{type}")
    @ResponseStatus(HttpStatus.OK)
    public VehicleListDTO getVehicleByMakeAndType(@PathVariable String make, @PathVariable String type) {
        return new VehicleListDTO(vehicleService.findByMakeAndVehicleTypes(make,type));
    }

}
