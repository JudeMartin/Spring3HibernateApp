package com.sjsu.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sjsu.model.Guest;

@Repository("guestDao")
public class GuestDaoImpl implements GuestDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(Guest guest) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(guest);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Guest> listGuests() {
		// TODO Auto-generated method stub
		return (List<Guest>) sessionFactory.getCurrentSession().createCriteria(Guest.class).list();

	}

	@Override
	public Guest getGuest(int guest_id) {
		// TODO Auto-generated method stub
		return (Guest) sessionFactory.getCurrentSession().get(Guest.class, guest_id);
	}

	@Override
	public void deleteGuest(Guest guest) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM guest WHERE guest_id = "+guest.getGuest_id()).executeUpdate();
	}

}
