package com.ecomm.entity;

import java.time.LocalDate;
import java.util.List;

import com.ecomm.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	private LocalDate orderDate;
	
	private LocalDate deliveryDate;
	
	private Double totalAmt;
	
	private Double gstAmt;
	
	private Double finalAmt;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItems> orderItems;
}
