package com.example.demo.exception;

public class HotelReserveNotFoundException extends RuntimeException
{
	public HotelReserveNotFoundException(String s)
	{
		super(s);
	}
}
