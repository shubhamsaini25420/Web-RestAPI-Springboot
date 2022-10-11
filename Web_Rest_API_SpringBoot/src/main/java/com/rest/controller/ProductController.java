package com.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Product;
import com.rest.service.ProductService;
@Validated
@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping("/addproduct")
	public Product addProduct(  @RequestBody @Valid Product product) {

		return service.saveProduct(product);

	}

	@GetMapping("/addproducts")
	public List<Product> addProducts(List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();

	}

	@RequestMapping("/get{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);

	}

	@RequestMapping("/get{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);

	}

	@RequestMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updataProduct(product);
	}

	@RequestMapping("/delete{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
