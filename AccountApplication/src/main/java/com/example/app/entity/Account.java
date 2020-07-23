package com.example.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int accountId;
	private String userName;
	private String password;
}
