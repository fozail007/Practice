package com.example.Customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Customer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    @Column
    private Integer mobileNo;

    @Column
    private String emailId;
    
    @Column
    @OneToMany(mappedBy="customer",fetch = FetchType.LAZY)
    private CustomerAddress customerAddress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Customer() {
		super();
	}

	

	public Customer(Integer id, String name, Integer mobileNo, String emailId, CustomerAddress customerAddress) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", customerAddress=" + customerAddress + "]";
	}

	
    

    }
