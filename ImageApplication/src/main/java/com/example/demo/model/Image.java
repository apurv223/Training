package com.example.demo.model;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "image_table")
public class Image {
	@Id
	@Column(name = "image_id")
	private UUID id;
	@Column(name = "image_url")
	private String imageUrl;
	


}