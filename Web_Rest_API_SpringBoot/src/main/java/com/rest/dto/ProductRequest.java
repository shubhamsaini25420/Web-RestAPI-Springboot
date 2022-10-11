package com.rest.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

	private int id;
	@NotNull(message = "username shouldn't be null ")
	private String name;
	private int quntity;
	@NotBlank
	private double price;

}
