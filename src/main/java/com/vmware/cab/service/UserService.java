package com.vmware.cab.service;

import com.vmware.cab.pojo.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  implements UserServiceIfc
{

    private List<UserDetails> userDetailsList;

    @Override
    public String registerUser(UserDetails input) {
        System.out.println("Registering User : "+ input);
        String registered = "Registration Successful";
        //Add custom validation here

        userDetailsList.add(input);
        return registered;
    }

    @Override
    public UserDetails checkNearestAvailableCabs(UserDetails input) {
        return null;
    }
}
