package com.bilichenko.jsoup.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.bilichenko.jsoup.model.SportMotorbike;

public class HibernateUtils {

	private static SessionFactory sessionFactory;

	public static SessionFactory getFactory() {
		if (sessionFactory != null) {
			return sessionFactory;
		}

		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(SportMotorbike.class);
		configuration.configure(HibernateUtils.class.getResource("/hibernate.cfg.xml"));
		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(configuration.getProperties());
		ServiceRegistry registry = serviceRegistryBuilder.build();

		sessionFactory = configuration.buildSessionFactory(registry);
		return sessionFactory;
	}
}
