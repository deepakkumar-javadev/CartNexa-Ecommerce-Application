package com.deepak.productService.DTO;

import lombok.Data;

@Data
public class productRequest {

	private String name;
	private double price;
	private String brand;
	private String color;
	private String size;
	private String category;
	private Integer Quantity;
	private String description;
	
}
