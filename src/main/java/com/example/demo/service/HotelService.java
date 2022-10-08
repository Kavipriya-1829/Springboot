package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Hotel;

public interface HotelService 
{
	public List<Hotel> findAll();
	public Hotel findById(int id);
	public void saveorUpdate(Hotel h);
	public void deleteById(int id);

}
