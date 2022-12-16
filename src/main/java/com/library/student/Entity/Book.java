package com.library.student.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {

	@Id
	private String isbn;
	
	private String title;
	private String description;
	private Integer year;
	private String edition;
	private String category;
	private String price;

}
