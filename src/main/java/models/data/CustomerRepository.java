package models.data;

import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Email;
import models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

 Customer findByEmail(Email email);



}
