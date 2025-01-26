package com.example.demo.crudcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Crudcontroller {

	
	ArrayList<Employee> emplist = new ArrayList<Employee>();
	public Crudcontroller() {
		// TODO Auto-generated constructor stub
		
		
		
		
		Employee emp2 = new Employee(2,2,"srikanth",10);
		Employee emp3 = new Employee(3,3,"sai",10);
		Employee emp4 = new Employee(4,4,"venky",10);
		
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
	}


	
	@GetMapping("/getdetails")
	public ArrayList<Employee> getdetails() {
		Employee emp1 = new Employee(1,2,"srikanth",10);
		try {
		String name="sk";
		return emplist;
		}
		catch(Exception e) {
			System.out.println("exceptionn>>"+e);
			return emplist;
		}
		
	}
	
	@GetMapping("/getbyid/{id}")
	public Employee getdetailbyid(@PathVariable("id") int id) {
		Employee det = new Employee(id, id, null, id);
		for(int i =0;i<emplist.size();i++) {
			if(emplist.get(i).getId()== id ) {
				det=emplist.get(i);
			}
		}
		
		
		return det;
	}
	@PostMapping("/updatebyid/{id}")
	public ArrayList<Employee>  updatebyid(@PathVariable("id") int id , @RequestBody() Employee em ) {
		
		for(int i =0;i<emplist.size();i++) {
			if(emplist.get(i).getId()== id ) {
				emplist.set(i,em);
			}
			}
		
		
		return emplist;
	}
	
	@GetMapping("/deletebyId/{id}")
	public ArrayList<Employee> deletebyid(@PathVariable("id") int id){
		for(int i=0;i<emplist.size();i++) {
			if(emplist.get(i).getId()==id) {
				emplist.remove(i);
			}
		}
		return emplist;
	}
}
