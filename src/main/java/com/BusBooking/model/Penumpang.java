package com.UjianBatch10Minggu10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "penumpang")
public class Penumpang {
	@Id
	@Column(name="nik")
	private String nik;
	private String nama;
	private String telepon;
	
//	@OneToOne(mappedBy = "nik")
//	@JsonIgnore
//	private Booking booking;
}