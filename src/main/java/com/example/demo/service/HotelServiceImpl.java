package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.HotelRepository;
import com.example.demo.entity.Hotel;

@Service
public class HotelServiceImpl implements HotelService
{	
	@Autowired 
	HotelRepository dao;

	@Override
	public List<Hotel> findAll() {
		
		return dao.findAll();
	}

	@Override
	public Hotel findById(int id) {
		Optional<Hotel>h= dao.findById(id);
		Hotel h1=null;
		if(h.isPresent())
		{
			h1=h.get();
		}
		return h1;
	}

	@Override
	public void saveorUpdate(Hotel h) {
		dao.save(h);
		
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	

}
