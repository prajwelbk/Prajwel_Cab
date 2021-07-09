package com.vmware.cab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProvider {

    @Autowired
    private CabServiceIfc cabService;

    @Autowired
    private UserServiceIfc userService;

    public CabServiceIfc getCabService() {
        return cabService;
    }

    public void setCabService(CabServiceIfc cabService) {
        this.cabService = cabService;
    }

    public UserServiceIfc getUserService() {
        return userService;
    }

    public void setUserService(UserServiceIfc userService) {
        this.userService = userService;
    }
}
