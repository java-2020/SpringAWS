package com.ssl.springdata.jpa.poc;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Override
	public void run(String... args) throws Exception {
		findTotalCount();
//		int startRow=1;
//		int untillRow=10;
//		getPagination(startRow,untillRow);
		//this.populateData();

//		Sort sort = new Sort(new Sort.Order(Direction.ASC, "lastName"));
//		@SuppressWarnings("deprecation")
//		Pageable pageable = new PageRequest(0, 5, sort);
//		List<Employee> employees = repo.findBySalaryGreaterThan(new Long(10000), pageable);
//		
//		
//		for (Employee e : employees) {
//			System.out.println(e.getFirstName());
//		}

	}
	
	public void findTotalCount(){
		String firstName="Emp1";
		List<Employee> result =  repo.findDepartmentCount(firstName);
		
	
		System.out.println("emp list:"+result.size());
		
	}
	
//	public void getPagination(int offset,int limit){
//		 // COUNT employees
//        System.out.println("\nGet count of Employees");
//        System.out.println("total Number of employees  : " + repo.count());
// 
//      //Retrieve 4 rows from first Page
//        System.out.println("\nGetting "+(limit-offset)+" rows from first Page");
//        Pageable pageable = new PageRequest(offset, limit);
//        Page<Employee> findPage1 = repo.findBydepartment("operation", pageable);
//        System.out.println("**************************");
//        for (Employee emp: findPage1) {
//            System.out.println(" findPage1--->:"+emp);
//        }
//        System.out.println("**************************");
//        System.out.println("Total elements in entity : " + findPage1.getTotalElements());
//        System.out.println("Total number of pages with "+(limit-offset)+" records/page : "  + findPage1.getTotalPages());
//        
//		//long count = repo.
//		//System.out.println(count);
//	}

	public void populateData() {
		for (int i = 1; i <= 200; i++) {
			Employee employee = new Employee();
			employee.setFirstName("Employee " + i);
			employee.setSalary(new Long(10000) * i);
			if(i<10 ){
			employee.setDepartment("sales");
			}
			if(i>20 & i< 30){
				employee.setDepartment("IT");
				}else{
					employee.setDepartment("operation");
						
				}
			repo.save(employee);
		}
	}

}