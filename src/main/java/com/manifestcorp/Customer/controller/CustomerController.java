package com.manifestcorp.Customer.controller;
import com.manifestcorp.Customer.model.Customer;
import com.manifestcorp.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    CustomerRepository customerRepository;
    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping({"", "/"})
    public ModelAndView customers() {
        ModelAndView mav = new ModelAndView("customers/customers");
        var customers = customerRepository.findAll();
        mav.addObject("customers", customers);
        return mav;
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("customerForm", new Customer());
        return "customers/add-customer";
    }
    @PostMapping(value = {"", "/"})
    public RedirectView addCustomer(Customer customer) {
        customerRepository.saveAndFlush(customer);
        return new RedirectView("customers");
    }
    @GetMapping("/showUpdateForm/{id}")
    public ModelAndView showUpdateForm(@PathVariable (name = "id") long id, Model model){
        ModelAndView mav = new ModelAndView("customers/edit-customer");
        Customer customer = customerRepository.findById(id).get();
        mav.addObject("customer",customer);
        return mav;
    }
    @GetMapping("/deleteCustomer/{id}")
    public String deleteBook(@PathVariable ("id") long id) {
        customerRepository.deleteById(id);
        return "redirect:/customers";
    }
}
