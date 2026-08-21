package com.dcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.dto.ProductDto;
import com.dcl.response.ApiResponse;

@Service
public class OrderService {

	@Autowired
	private FeignService fservice;
	
	public List<ProductDto> getAllProducts(){
		ApiResponse<?> response=fservice.getAllProducts();
		List<ProductDto> dtoList=(List<ProductDto>)response.getResponse();
		return dtoList;
	}
	
}
