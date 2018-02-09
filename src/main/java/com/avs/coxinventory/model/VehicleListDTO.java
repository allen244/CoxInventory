package com.avs.coxinventory.model;

import com.avs.coxinventory.domain.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VehicleListDTO {

    List<Vehicle> vehicles;
}
