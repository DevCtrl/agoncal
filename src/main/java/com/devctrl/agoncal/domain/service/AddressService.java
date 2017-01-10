package com.devctrl.agoncal.domain.service;

import com.devctrl.agoncal.data.entity.Address;

/**
 * Created by rob on 04.01.17.
 */
public interface AddressService {

    Address getAddressById(long id);

    Address saveAddress(Address address);

    Address updateAddress(Address address);

    Address deleteAddress(Address address);
    Address deleteAddress(long id);

}
