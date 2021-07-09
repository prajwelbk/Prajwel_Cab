package com.vmware.cab.pojo;

public class CabDetails {

    private String vehicleNumber;
    private String currentLocation;
    private String vehicleOwner;
    private String vehicleDetails;
    private boolean cabAvailable;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }


    public boolean isCabAvailable() {
        return cabAvailable;
    }

    public void setCabAvailable(boolean cabAvailable) {
        this.cabAvailable = cabAvailable;
    }

    @Override
    public String toString() {
        return "CabDetails{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", vehicleOwner='" + vehicleOwner + '\'' +
                ", vehicleDetails='" + vehicleDetails + '\'' +
                ", cabAvailable=" + cabAvailable +
                '}';
    }
}
