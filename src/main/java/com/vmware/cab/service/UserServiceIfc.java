package com.vmware.cab.service;

import com.vmware.cab.pojo.UserDetails;

public interface UserServiceIfc {

    public String registerUser(UserDetails input);

    UserDetails checkNearestAvailableCabs(UserDetails input);
}
