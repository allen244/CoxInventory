package com.avs.coxinventory.domain;


public interface Automobile {

    public double getPrice();

    public String getModel();

    public String getMake();

    public long getMileage();

    public String getVin();

    public int getMsrp();

    public int getYear();

    public Color getColor();

    public FuelTypes getFuelTypes();

}
