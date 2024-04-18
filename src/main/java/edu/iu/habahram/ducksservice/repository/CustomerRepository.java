package edu.iu.habahram.ducksservice.repository;

import org.springframework.stereotype.Repository;
import edu.iu.habahram.ducksservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>{

    Customer findByUsername(String username);
}
