package com.shopsy.main.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EMALL_PRODUCT")
@Getter
@Setter
public class Product {

	@Id // primary key.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //
	@Column(nullable = false)
	private Long productId;

	@Column(nullable = false, length = 20)
	private String productName;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private Double price;

	@Column(nullable = false)
	private Double discountPrice;
	
	@Column(nullable = false)
	private String availableStatus;

	@Column(nullable = false)
	private Integer quantity;
	
	@Column()
	private Long categoryId;

	
	
	@Column(nullable = false, updatable = false)
	private String createdBy;

	@CreationTimestamp
	@Column(name = "CREATED_DATE", columnDefinition = "TIMESTAMP", updatable = false, nullable = false)
	private LocalDateTime created_date;

	@Column(nullable = false)
	private String updatedBy;

	

	@UpdateTimestamp
	@Column(name = "UPDATED_DATE", nullable = false)
	private LocalDateTime updated_date;


	

}
