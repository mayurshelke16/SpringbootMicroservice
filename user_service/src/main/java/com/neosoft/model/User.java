package com.neosoft.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
    private Long userId;

	private String name;
    private String phone;

    
    List<Contact> contacts=new ArrayList<>();
	
	
	  public Long getUserId() 
	  {
		  return userId;
		  }
	  public void setUserId(Long userId)
	  {
		  this.userId = userId; 
		  }
	  public List<Contact> getContacts() {
		  return contacts;
		  }
	  public void setContacts(List<Contact> contacts) { 
		  this.contacts =contacts; 
		  }
	  public String getName() {
		  return name;
		  } 
	  public void setName(String name) {
		  this.name = name; 
		  }
	  public String getPhone() {
		  return	  phone;
		  }
	  public void setPhone(String phone) {
		  this.phone = phone; 
		  }
	  
	 	
	
	
    
}
