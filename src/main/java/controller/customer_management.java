
package controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dao.customerDao;
import entities.Customer;
import service.customerServiceImpl;

@RestController
@RequestMapping("/customers")
public class customer_management {
	
	@Autowired
	customerServiceImpl cs;

	@RequestMapping("/getAll")
	public Customer[] getAllCustomer(String userid) {
		String[] arr = {"aman", "print"};
		
		Customer obj1 = new Customer("1", "aman", "96954355666", "R 12, homskk, jaipur");
		Customer obj2 = new Customer("1", "aman", "96954355666", "R 12, homskk, jaipur");
		Customer obj3 = new Customer("1", "aman", "96954355666", "R 12, homskk, jaipur");
		Customer obj4 = new Customer("1", "aman", "96954355666", "R 12, homskk, jaipur");
		Customer obj5 = new Customer("1", "aman", "96954355666", "R 12, homskk, jaipur");
		System.out.println(arr);
		
		Customer[] arr1 = {obj1, obj2, obj3, obj4, obj5 };
		
		ArrayList<Customer> cd = cs.getCustomer();
	
		
		
		return arr1;

	}
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer c) {
		
		return c;
	}
	
	
	@GetMapping("/{customerid}")
	public String getCustomer(@PathVariable("customerid") String custID) {
		System.out.print(custID);
		return 401;	
	}
		
}
