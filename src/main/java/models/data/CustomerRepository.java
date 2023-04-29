package models.data;


import jakarta.validation.constraints.Email;
import models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
@Component
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

 Customer findByEmail(String email);


}
