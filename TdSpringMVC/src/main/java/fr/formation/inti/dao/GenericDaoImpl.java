package fr.formation.inti.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDaoImpl<T, ID extends Serializable> implements GenericDao<T, ID> {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<T> type;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public GenericDaoImpl() {
//		ParameterizedType genericSuperClass = (ParameterizedType) getClass().getGenericSuperclass();
//		this.type = (Class<T>) genericSuperClass.getActualTypeArguments()[0];
//		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//		this.sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//		this.session = sessionFactory.getCurrentSession();
	}

//	public void beginTransaction() {
//		if (!session.isOpen()) {
//			session = sessionFactory.openSession();
//		}
//		session.getTransaction().begin();
//	}
//
//	public void commit(boolean ok) {
//		if (ok)
//			session.getTransaction().commit();
//		else
//			session.getTransaction().rollback();
//			session.close();
//	}

	public T findById(ID id) {
		return sessionFactory.getCurrentSession().get(type, id);
	}

	public List<T> findAll() {

		return sessionFactory.getCurrentSession().createQuery("select t from " + type.getName() + " t").getResultList();
	}

	public T save(T entiy) {
		sessionFactory.getCurrentSession().saveOrUpdate(entiy);
		return entiy;
	}

	public void delete(T entiy) {
		sessionFactory.getCurrentSession().delete(entiy);

	}

	public void deleteById(ID id) {
		T t = sessionFactory.getCurrentSession().get(type, id);
		sessionFactory.getCurrentSession().delete(t);

	}

	public void close() {
		this.sessionFactory.getCurrentSession().close();
		this.sessionFactory.close();
	}

}
