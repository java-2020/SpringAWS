package com.ssl.springdata.jpa.poc;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable> {

	public List<Employee> findBySalaryGreaterThan(Long salary, Pageable pageable);
	
	//@Query("select new map(count(v) as cnt, v.department) from Employee v group by v.department")
	@Query("select new map(count(v) as cnt) from Employee v where v.firstName:first_name group by v.department")
	public List<Employee> findDepartmentCount(String first_name);
	
	@Query("select count(v) as cnt from Employee v group by v.department")
	public List<Employee> findDepartmentTotalCount();
	
	
	//For pagination, it must have 'Pageable' as last parameter and return Page<>
    Page<List<Employee>> findBydepartment(String deptName, Pageable pageable);
    
	

}
