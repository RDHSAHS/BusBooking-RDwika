package com.UjianBatch10Minggu10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "perusahaan")
public class Perusahaan{
	@Id
	@Column(name="nama")
	private String nama;
	private String alamat;
}
