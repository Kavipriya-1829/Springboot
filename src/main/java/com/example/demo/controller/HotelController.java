package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotel;
import com.example.demo.exception.HotelReserveNotFoundException;
import com.example.demo.service.HotelService;

@RestController
@RequestMapping("/hotelreservation")
public class HotelController 
{
	@Autowired
	HotelService Service;
	@GetMapping("/details")
	public List<Hotel>findAll()
	{
		return Service.findAll();
		
	}
	@GetMapping("/findbyid/{id}")
	public Hotel findById(@PathVariable int id)
	{
		return Service.findById(id);
	}
	@PostMapping("/save")
	public void save(@RequestBody Hotel h)
	{
		h.setC_no(0);
		Service.saveorUpdate(h);
	}
	@PutMapping("/update")
	public void update(@RequestBody Hotel h)
	{
		Service.saveorUpdate(h);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		Hotel a=findById(id);
		if(a==null)
		{
			throw new HotelReserveNotFoundException("delete C_No not found");
		}
		else
		{
			Service.deleteById(id);
		}
		return "Hotel"+id;
	}
}
