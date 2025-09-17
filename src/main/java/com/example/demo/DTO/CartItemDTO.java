package com.example.demo.DTO;

import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Products;

public class CartItemDTO {

	private Integer id;
	private Products product;
	private Cart cart;
	private Integer Quantity;
	private Integer price;
	public CartItemDTO(Integer id, Products product, Cart cart, Integer quantity, Integer price) {
		super();
		this.id = id;
		this.product = product;
		this.cart = cart;
		Quantity = quantity;
		this.price = price;
	}
	public CartItemDTO() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}
