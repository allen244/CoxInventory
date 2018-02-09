package com.avs.coxinventory.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Vehicle implements Automobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double price;
    private int msrp;
    private String model;
    private String make;
    private String vin;
    private long mileage;
    private int year;

    @Enumerated(value = EnumType.STRING)
    private Color color;

    @Enumerated(value = EnumType.STRING)
    private FuelTypes fuelTypes;


    private String vehicleTypes;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getMsrp() {
        return msrp;
    }

    public void setMsrp(int msrp) {
        this.msrp = msrp;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public FuelTypes getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(FuelTypes fuelTypes) {
        this.fuelTypes = fuelTypes;
    }

    public String getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(String vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
