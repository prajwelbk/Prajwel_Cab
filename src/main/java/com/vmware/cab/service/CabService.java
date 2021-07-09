package com.vmware.cab.service;

import com.vmware.cab.pojo.BookingDetails;
import com.vmware.cab.pojo.CabDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class CabService implements CabServiceIfc{

    private List<CabDetails> cabDetailsList;


    //Adding vehicle number and customer name here
    private Map<String,String> bookingDetails;

    @Override
    public String registerCab(CabDetails input){
        String registration = "Registered Successfully";

        //Adding data separately since The Pojo Class for details and Adding cabs is reused
        // and the boolean variable is available will be set only when add cabs is called
        CabDetails newCab = new CabDetails();
        newCab.setCurrentLocation(input.getCurrentLocation());
        newCab.setVehicleDetails(input.getVehicleDetails());
        newCab.setVehicleNumber(input.getVehicleNumber());
        newCab.setVehicleOwner(input.getVehicleOwner());
        //Add Validation Here


        //Add the cabs to the above list
        cabDetailsList.add(newCab);
        return registration;
    }

    //marking cab as available here
    @Override
    public String addCabs(CabDetails input) {

        //Getting the cab with a particular vehicle number and marking it as available
        cabDetailsList.stream().filter(val-> val.getVehicleNumber().equals(input.getVehicleNumber())).findFirst().ifPresent(val->val.setCabAvailable(true));
        return "SuccessFully Added Cabs";
    }

    @Override
    public CabDetails bookCab(BookingDetails input) {
        bookingDetails.put(input.getVehicleNumber(),input.getCustomerName());

        Optional<CabDetails> cabData = cabDetailsList.stream().filter(val->val.getVehicleNumber() == input.getVehicleNumber()).findFirst();
        cabDetailsList.stream().filter(val->val.getVehicleNumber() == input.getVehicleNumber()).findFirst().get().setCabAvailable(false);
        return cabData.get();
    }
}
