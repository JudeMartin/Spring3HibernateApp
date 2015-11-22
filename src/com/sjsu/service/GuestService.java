package com.sjsu.service;

import java.util.List;

import com.sjsu.model.Guest;

public interface GuestService {
	public void addGuest(Guest guest);

	public List<Guest> listGuests();
	
	public Guest getGuest(int guest_id);
	
	public void deleteGuest(Guest guest);
}
