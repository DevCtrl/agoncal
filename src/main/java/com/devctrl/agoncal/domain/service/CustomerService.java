package com.devctrl.agoncal.domain.service;

import com.devctrl.agoncal.data.entity.Customer;

/**
 * Created by rob on 21.12.16.
 */
public interface CustomerService extends Service{

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(long id);

    Customer updateCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);
    Customer deleteCustomer(long id);

}
