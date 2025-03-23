package com.sliit.slotopzi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
// get vehicles of customers and show vehicle number list
public class VehicleListResponse {
    private String vehicleNumber;
    private String vin;
    private String make;
    private String model;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
