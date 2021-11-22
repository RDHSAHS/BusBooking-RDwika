package com.UjianBatch10Minggu10.model;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_keberangkatan",referencedColumnName = "id")
	private long id_keberangkatan;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(unique = true, name = "nik", referencedColumnName = "nik")
	private String nik;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "tanggal", referencedColumnName = "tanggal")
	private String tanggal;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_jurusan", referencedColumnName = "id")
	private long id_jurusan;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(unique = true, name = "no_polisi", referencedColumnName = "nomor_polisi")
	private String no_polisi;
}
