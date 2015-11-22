package com.sjsu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sjsu.dao.GuestDao;
import com.sjsu.model.Guest;

@Service("guestService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GuestServiceImpl implements GuestService {
	
	@Autowired
	private GuestDao guestDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addGuest(Guest guest) {
		guestDao.addEmployee(guest);
	}

	public List<Guest> listGuests() {
		return guestDao.listGuests();
	}

	public Guest getGuest(int guest_id) {
		return guestDao.getGuest(guest_id);
	}

	public void deleteGuest(Guest guest) {
		guestDao.deleteGuest(guest);
	}

}
