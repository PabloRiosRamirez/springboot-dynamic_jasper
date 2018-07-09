/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
 *
 */

package com.pabloriosramirez.springboot.dynamicjasper.service;

import com.pabloriosramirez.springboot.dynamicjasper.model.Customer;
import java.util.List;

public interface CustomerService {

    List<Customer> findAll();
}
