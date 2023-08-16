package com.manifestcorp.Customer;

import com.manifestcorp.Customer.model.Customer;
import com.manifestcorp.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private CustomerRepository customerRepository;

    @Autowired
    public BootStrap(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (customerRepository.count() < 1) {
            customerRepository.save(
                    Customer.builder()
                            .name("John")
                            .age(21)
                            .title("Software Engineer")
                            .homeTown("columbus")
                            .build()
            );
        }
    }
}
