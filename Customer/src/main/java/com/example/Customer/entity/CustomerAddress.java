package com.example.Customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class CustomerAddress {

    @ManyToOne
    private Customer customer;
    @Column
    private String address;

    @Column
    private String state;

    @Column
    private String city;

    @Column
    private  Integer pincode;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public CustomerAddress() {
		super();
	}

	public CustomerAddress(Customer customer, String address, String state, String city, Integer pincode) {
		super();
		this.customer = customer;
		this.address = address;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CustomerAddress [customer=" + customer + ", address=" + address + ", state=" + state + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
    

	}
