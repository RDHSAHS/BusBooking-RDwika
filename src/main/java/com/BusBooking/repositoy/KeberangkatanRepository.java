package com.UjianBatch10Minggu10.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.UjianBatch10Minggu10.model.Keberangkatan;
import com.UjianBatch10Minggu10.model.KeberangkatanDetails;

public interface KeberangkatanRepository extends JpaRepository <Keberangkatan, Long>	{
	@Query(value="SELECT k.id, bus.nama_perusahaan as perusahaan, k.kelas, k.harga, "
			+ "k.tanggal as waktu, j.deskripsi, bus.kapasitas FROM keberangkatan as k "
			+ "INNER JOIN bus ON k.no_polisi = bus.nomor_polisi INNER JOIN jurusan as j ON k.id_jurusan = j.id "
			+ "INNER JOIN booking as b ON b.no_polisi = bus.nomor_polisi WHERE j.terminal_awal = ?1 "
			+ "AND k.tanggal LIKE ?2% GROUP BY b.id_keberangkatan HAVING COUNT(b.id_keberangkatan) < bus.kapasitas"
			,nativeQuery = true)
	List<KeberangkatanDetails> findKeberangkatan(String terminal, String tanggal);
}
