package com.library.student.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Borrow {

	@Id
	private Long id;
	private String bookid; 
	private Integer studentid;
	private String issued_date;
	private String due_date;
	private String returned_date;
	private String fine;
	
}
