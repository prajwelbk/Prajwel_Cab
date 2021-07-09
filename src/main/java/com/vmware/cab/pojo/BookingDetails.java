package com.vmware.cab.pojo;

public class BookingDetails {

    String vehicleNumber;
    String customerName;
    String customerLocation;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                '}';
    }
}
