package com.library.student.Entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
 

@Entity
@Data
public class Student {

	@Id
	private Long id;
	private String name;
	private Integer age;
	private String grade;
	private String classname;
	private String email;
	private String mobile; 
}
