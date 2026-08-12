package com.dcl.entity;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@NotBlank(message = "Username cannot be null!")
	private String username;
	
	
	@Length(min = 10, max = 10, message = "Phone Number must be of 10 digits!")
	@NotBlank(message = "Phone number cannot be empty")
	private String phone;
	
	@Email(message = "Please enter the valid email Id")
	@NotBlank(message = "Email Id cannot be empty!")
	@Column(unique=true)
	private String email;
}
