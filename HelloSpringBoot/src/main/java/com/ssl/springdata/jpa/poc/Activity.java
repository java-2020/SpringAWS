package com.ssl.springdata.jpa.poc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter @Setter @NoArgsConstructor 
public class Activity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@TableGenerator(name = "activity", allocationSize = 1)
	private Long employeeId;
	private Long userName;
	private String sessionid;
	private String activitydate;
	private String jsonrequest;
	
	

}
