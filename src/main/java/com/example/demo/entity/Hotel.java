package com.example.demo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotelreservation")
public class Hotel 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="c_no")
	private int c_no;
	@Column(name="c_name")
	private String c_name;
	@Column(name="contact_no")
	private long contact_no;
	@Column(name="check_in")
	private Date check_in;
	@Column(name="check_out")
	private Date check_out;
	@Column(name="room_type")
	private String room_type;
	@Column(name="charges_per_day")
	private double charges_per_day;
	@Column(name="Total_Amount")
	private double Total_Amount;
	public Hotel()
	{
		
	}
	public Hotel(String c_name, long contact_no, Date check_in, Date check_out, String room_type,
			double charges_per_day, double total_Amount) 
	{
		super();
		this.c_name = c_name;
		this.contact_no = contact_no;
		this.check_in = check_in;
		this.check_out = check_out;
		this.room_type = room_type;
		this.charges_per_day = charges_per_day;
		Total_Amount = total_Amount;
	}
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public Date getCheck_in() {
		return check_in;
	}
	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}
	public Date getCheck_out() {
		return check_out;
	}
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public double getCharges_per_day() {
		return charges_per_day;
	}
	public void setCharges_per_day(double charges_per_day) {
		this.charges_per_day = charges_per_day;
	}
	public double getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(double total_Amount) {
		Total_Amount = total_Amount;
	}
	@Override
	public String toString() {
		return "Hotel [c_no=" + c_no + ", c_name=" + c_name + ", contact_no=" + contact_no + ", check_in=" + check_in
				+ ", check_out=" + check_out + ", room_type=" + room_type + ", charges_per_day=" + charges_per_day
				+ ", Total_Amount=" + Total_Amount + "]";
	}
	
	

}
