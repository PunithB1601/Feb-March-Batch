package com.dcl.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="movie_tb")
public class Movie {

	@Id
	private Integer movieId;
	
	//@Column(name="m_name")
	//@Column(unique=true,nullable=false)
	private String movieName;
	
	private String language;
	
	private LocalDate releaseDate;
	
	private String certification;

}
