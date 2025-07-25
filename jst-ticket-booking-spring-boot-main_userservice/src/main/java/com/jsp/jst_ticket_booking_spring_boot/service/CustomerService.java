package com.jsp.jst_ticket_booking_spring_boot.service;

import com.jsp.jst_ticket_booking_spring_boot.dto.Customer;
import com.jsp.jst_ticket_booking_spring_boot.response.ResponseStructure;
import org.apache.catalina.User;

public interface CustomerService {
    ResponseStructure<Customer> saveCustomerService(Customer customer);

    ResponseStructure<Customer> loginCustomerWithEmailAndPasswordService(String email,String password);


    User getUser(String email);
}
