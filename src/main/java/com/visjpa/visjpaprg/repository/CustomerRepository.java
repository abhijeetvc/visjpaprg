package com.visjpa.visjpaprg.repository;

import com.visjpa.visjpaprg.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
