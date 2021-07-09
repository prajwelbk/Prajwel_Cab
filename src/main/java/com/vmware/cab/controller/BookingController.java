package com.vmware.cab.controller;

import com.vmware.cab.pojo.BookingDetails;
import com.vmware.cab.pojo.CabDetails;
import com.vmware.cab.pojo.UserDetails;
import com.vmware.cab.service.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BookingController {

    @Autowired
    private ServiceProvider serviceProvider;
    //Using post call to register for driver and customer
    //Response will be if the registering of cabs is successful or not
    @PostMapping(path="/cab/registerCab")
    public String registerCab(HttpServletRequest request,
                                                  CabDetails input){
        System.out.println("Entered Register Service for input :"+input);
        return serviceProvider.getCabService().registerCab(input);
    }

    //Response will be if the registering users is successful or not
    @PostMapping(path="/cab/registerUser")
    public String registerUser(HttpServletRequest request,
                                                  UserDetails input){
        System.out.println("Entered Register User Service for input :"+input);

        return serviceProvider.getUserService().registerUser(input);
    }

    //Using post call since cabs will have extra info to be saved
    //Response will be if the adding of cabs is successful or not
    @PostMapping(path="/cab/addCabs")
    public String addCabs(HttpServletRequest request,CabDetails input){
        System.out.println("Entered Add Cabs :"+input);

        return serviceProvider.getCabService().addCabs(input);
    }

    //Using Post call since the user has to send the location info and the user details
    @PostMapping(path="/cab/checkNearestAvailableCabs")
    public CabDetails checkNearestAvailableCabs(HttpServletRequest request, UserDetails input){
        System.out.println("Checking Nearest Available Cabs");
        return null;
    }


    @PostMapping(path="/cab/bookCab")
    public CabDetails bookCab(HttpServletRequest request, BookingDetails input){
        System.out.println("Booking the Cab");
        return null;
    }
}
