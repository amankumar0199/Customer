package service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.customerDao;
import entities.Customer;

@Service
public class customerServiceImpl implements customerService{
	@Autowired
	private customerDao obj;

	@Override
	public ArrayList<Customer> getCustomer() {
		// TODO Auto-generated method stub
		
		
		return (ArrayList<Customer>) obj.findAll();
	}
}



