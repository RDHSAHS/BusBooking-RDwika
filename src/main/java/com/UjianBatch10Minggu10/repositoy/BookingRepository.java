package com.UjianBatch10Minggu10.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UjianBatch10Minggu10.model.Booking;

public interface BookingRepository extends JpaRepository <Booking, Long>	{
	
}
