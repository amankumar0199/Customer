package dao;
import java.util.ArrayList;



import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entities.Customer;

@Repository
public interface customerDao extends JpaRepository<Customer, String>{
	
	@Query("from Customer import *")
	public ArrayList<Customer> getall();
}

