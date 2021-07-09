package com.vmware.cab.service;

import com.vmware.cab.pojo.BookingDetails;
import com.vmware.cab.pojo.CabDetails;

public interface CabServiceIfc {

    String registerCab(CabDetails input);


    String addCabs(CabDetails input);

    CabDetails bookCab(BookingDetails input);
}
