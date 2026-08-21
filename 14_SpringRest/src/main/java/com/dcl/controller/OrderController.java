package com.dcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.dto.ProductDto;
import com.dcl.response.ApiResponse;
import com.dcl.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService oservice;
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllProducts(){
		List<ProductDto> dtoList=oservice.getAllProducts();
		ApiResponse response=new ApiResponse<>("Data fetched from Product Service - 8085", dtoList, HttpStatus.OK);
		return ResponseEntity.ok(response);
	}
	
}
