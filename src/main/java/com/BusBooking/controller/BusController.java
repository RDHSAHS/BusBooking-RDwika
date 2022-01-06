package com.UjianBatch10Minggu10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UjianBatch10Minggu10.model.Booking;
import com.UjianBatch10Minggu10.model.Keberangkatan;
import com.UjianBatch10Minggu10.model.KeberangkatanDetails;
import com.UjianBatch10Minggu10.model.Penumpang;
import com.UjianBatch10Minggu10.repositoy.BookingRepository;
import com.UjianBatch10Minggu10.repositoy.KeberangkatanRepository;
import com.UjianBatch10Minggu10.repositoy.PenumpangRepository;

@RestController
@RequestMapping("/busbookingsystem")
public class BusController {
	
	@Autowired
	PenumpangRepository penumpangRepo;
	
	@Autowired
	KeberangkatanRepository keberangkatanRepo;
	
	@Autowired
	BookingRepository bookingRepo;
	
	@PostMapping("/insertPenumpang")
	public String postData(@RequestBody Penumpang penumpang) {
		penumpangRepo.save(penumpang);
		return "Data penumpang berhasil ditambahkan";
	}
	@GetMapping("/getPenumpang/{nik}")
	public String checkPenumpang(@PathVariable String nik) {
		String message = "";
		List<Penumpang> hasil = penumpangRepo.checkPenumpang(nik);
		if(hasil.size() == 0)	{
			message = "Penumpang belum terdaftar, silahkan buat akun";
		}else	{
			message = "Penumpang telah terdaftar";
		}
		return message;
	}
	@GetMapping("/getPenumpang2/{nik}")
	public String checkPenumpang2(@PathVariable String nik) {
		return penumpangRepo.checkPenumpang2(nik);
	}
	@GetMapping("/findKeberangkatan")
	public List<KeberangkatanDetails> findKeberangkatan(@RequestParam(value="terminal") String terminal,
			@RequestParam(value="tanggal") String tanggal)	{
		return keberangkatanRepo.findKeberangkatan(terminal, tanggal);
	}
	
	@PostMapping("/booking")
	public String postData(@RequestBody Booking booking)	{
		bookingRepo.save(booking);
		return "Pemesanan bus berhasil";
	}
	@DeleteMapping("/cancel")
	public String deleteById(@RequestParam(value="id") long id)	{
		bookingRepo.deleteById(id);
		return "Pemesan dengan nomor id "+id+" telah dibatalkan";
	}
}
