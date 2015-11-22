package com.sjsu.dao;

import java.util.List;

import com.sjsu.model.Guest;

public interface GuestDao {
	public void addEmployee(Guest guest);

	public List<Guest> listGuests();
	
	public Guest getGuest(int guest_id);
	
	public void deleteGuest(Guest guest);
	
}
