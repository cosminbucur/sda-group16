package com.sda.hibernate.audit;

import com.sda.hibernate.audit.customer.Customer;
import com.sda.hibernate.audit.customer.CustomerRepository;

public class DemoAudit {

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();

        Customer customer = new Customer();
        customer.setFirstName("jon");
        customer.setLastName("snow");

        customerRepository.create(customer);

        Customer newCustomer = customerRepository.findById(1L);
        newCustomer.setFirstName("alex");
        newCustomer.setLastName("vasile");

        customerRepository.update(newCustomer);

        Customer updatedCustomer = customerRepository.findById(1L);
        customerRepository.delete(updatedCustomer);
    }
}
