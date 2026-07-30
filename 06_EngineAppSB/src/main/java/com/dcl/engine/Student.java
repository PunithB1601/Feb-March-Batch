package com.dcl.engine;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private Integer sid;
	
	private String name;
	
	private Integer age;
	
	private Double percentage;
	
	private String branch;
	
}
