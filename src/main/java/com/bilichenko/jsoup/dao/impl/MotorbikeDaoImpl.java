package com.bilichenko.jsoup.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bilichenko.jsoup.dao.MotorbikeDao;
import com.bilichenko.jsoup.model.AbstractMotorbike;
import com.bilichenko.jsoup.utils.HibernateUtils;

public class MotorbikeDaoImpl implements MotorbikeDao {

	private static final SessionFactory sessionFactory = HibernateUtils.getFactory();

	@Override
	public AbstractMotorbike save(AbstractMotorbike motorbike) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Long id = (Long) session.save(motorbike);
		session.getTransaction().commit();
		session.close();
		motorbike.setId(id);
		return motorbike;
	}

	@Override
	public void saveAll(List<AbstractMotorbike> motorbikes) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		motorbikes.forEach(session::save);
		session.getTransaction().commit();
		session.close();
	}
}