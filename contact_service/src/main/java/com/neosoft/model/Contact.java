package com.neosoft.model;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Contact {


	@Id
    private Long cId;
    private String email;
    private String contactName;
 //  @DBRef
    private Long userId;
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Contact(Long cId, String email, String contactName, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}
	public Contact get() {
		// TODO Auto-generated method stub
		return null;
	}

    
    
}
