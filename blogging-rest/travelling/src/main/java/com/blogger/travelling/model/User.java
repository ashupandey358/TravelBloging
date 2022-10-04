package com.blogger.travelling.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")	
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "contact")
	private String mobileNumber;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "gender")
	private String gender;
}
