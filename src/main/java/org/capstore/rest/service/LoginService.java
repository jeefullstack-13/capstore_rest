package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Customer;



public interface LoginService {
public void save(Customer customer);

public Customer getOneByEmail(String email);

public List<Customer> getAll();

public Customer findById(int id);

public void updateCustomer(Customer cust);

public Customer getOne(Integer fid);

public void changePassword(int customerId, String newPassword);
}
