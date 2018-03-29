
package com.ssl.springdata.jpa.poc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@TableGenerator(name = "employee", allocationSize = 1)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private Long salary;
	private String department;
	private String createDate;
 
	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Long getEmployeeId() {
		return employeeId;
	}
 
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 
	public Long getSalary() {
		return salary;
	}
 
	public void setSalary(Long salary) {
		this.salary = salary;
	}
 
	public String getDepartment() {
		return department;
	}
 
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", department=" + department + ", createDate=" + createDate + "]";
	}
 
	

 
}