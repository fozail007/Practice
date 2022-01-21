package com.example.Customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Customer.entity.Customer;
import com.example.Customer.entity.CustomerAddress;
import com.example.Customer.repository.CustomerRepository;

@Service
public class CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(int id, Customer customer) {
        Customer updatedCustomer = customerRepository.findById(id).orElse(null);
        CustomerAddress customerAddress= new CustomerAddress();
        customerAddress.setAddress(customer.getCustomerAddress().getCity());
        customerAddress.setCity(customer.getCustomerAddress().getState());
        customerAddress.setState(customer.getCustomerAddress().getState());
        customerAddress.setPincode(customer.getCustomerAddress().getPincode());
      
        updatedCustomer.setCustomerAddress(customerAddress);
        updatedCustomer.setName(customer.getName());
        updatedCustomer.setEmailId(customer.getEmailId());
        updatedCustomer.setMobileNo(customer.getMobileNo());
        return customerRepository.save(updatedCustomer);
    }
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

}
