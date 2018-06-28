package com.pabloriosramirez.springboot.dynamicjasper.service;

import com.pabloriosramirez.springboot.dynamicjasper.model.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}
