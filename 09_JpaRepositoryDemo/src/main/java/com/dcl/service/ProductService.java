package com.dcl.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dcl.entity.Product;
import com.dcl.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository prepo;
	
	public Product addProduct(Product p) {
		return prepo.save(p);
	}
	
	public Product getProductById(Integer productId) {
		return prepo.findById(productId).orElse(null);
	}
	
//	public List<Product> getAllProduct(Integer pageNum){
	public List<Product> getAllProduct(){
	//	 Sort s=Sort.by("price").descending();
	//	 Pageable pages =PageRequest.of(pageNum-1,3);
	//	return prepo.findAll(pages).stream().collect(Collectors.toList());
		Product p=new Product();
		//p.setBrand("Wildcraft");
		p.setPrice(699.0);
		p.setBrand("Adidas");
		Example<Product> qbe=Example.of(p);
		return prepo.findAll(qbe);
	}

}
