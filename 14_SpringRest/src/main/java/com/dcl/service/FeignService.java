package com.dcl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.dcl.response.ApiResponse;

@FeignClient(name = "PRODUCT-API",url="http://localhost:8085/product")
public interface FeignService {

	@GetMapping("/get")
	public ApiResponse<?> getAllProducts();
	
}
