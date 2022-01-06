package com.UjianBatch10Minggu10.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@Column(name = "nomor_polisi")
	private String nomor_polisi;
	private int kapasitas;
	private String nama_supir;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "nama_perusahaan",referencedColumnName = "nama")
	private Perusahaan nama_perusahaan;
	
	@OneToOne(mappedBy = "no_polisi")
	@JsonIgnore
	private Keberangkatan keberangkatan;
	
//	@OneToOne(mappedBy = "no_polisi")
//	@JsonIgnore
//	private Booking booking;
}
