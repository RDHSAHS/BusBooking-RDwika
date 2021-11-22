package com.UjianBatch10Minggu10.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.UjianBatch10Minggu10.model.Penumpang;

public interface PenumpangRepository extends JpaRepository <Penumpang, String>{
	List<Penumpang> findByNik(String nik);
	
	@Query(value="SELECT * FROM `penumpang` WHERE nik = ?1",nativeQuery = true)
	List<Penumpang> checkPenumpang(String nik);
	
	@Query(value="SELECT IF(nik=?1,'Penumpang telah terdaftar','Penumpang belum"
			+ " terdaftar, silahkan buat akun') FROM penumpang",nativeQuery = true)
	String checkPenumpang2(String nik);
	
}
