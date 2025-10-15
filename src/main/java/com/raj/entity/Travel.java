package com.raj.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
public class Travel {
	@Id
	@SequenceGenerator(sequenceName = "sq1",initialValue = 1, allocationSize =1, name = "ab")
	@GeneratedValue(generator="ab",strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(length = 20)
	private String destination;
	@Column(length = 20)
	private String transportationMode;
	private Double price;

}
